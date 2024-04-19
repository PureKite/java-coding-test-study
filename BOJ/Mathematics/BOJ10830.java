import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10830 {
	private static int[][] original;

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		int n = Integer.parseInt(stringTokenizer.nextToken());
		long b = Long.parseLong(stringTokenizer.nextToken());

		original = matrix(n, bufferedReader);
		int[][] resultMatrix = pow(original, b);

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				stringBuilder.append(resultMatrix[i][j]).append(" ");
			}
			stringBuilder.append("\n");
		}

		System.out.println(stringBuilder);
	}

	private static int[][] matrix(int n, BufferedReader bufferedReader) throws IOException {
		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			for (int j = 0; j < n; j++) {
				matrix[i][j] = Integer.parseInt(stringTokenizer.nextToken()) % 1000;
			}
		}

		return matrix;
	}

	private static int[][] mul(int[][] a, int[][] b) {
		int n = a.length;
		int[][] resultMatrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					resultMatrix[i][j] += a[i][k] * b[k][j];
				}
				resultMatrix[i][j] %= 1000;
			}
		}

		return resultMatrix;
	}

	private static int[][] pow(int[][] matrix, long b) {
		if (b == 1L) {
			return matrix;
		}

		int[][] result = pow(matrix, b / 2);

		result = mul(result, result);

		if (b % 2 == 1L) {
			result = mul(result, original);
		}

		return result;
	}
}
