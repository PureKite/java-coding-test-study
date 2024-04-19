import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2740 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


		int[][] matrixA = matrix(bufferedReader);
		int[][] matrixB = matrix(bufferedReader);

		int[][] resultMatrix = mul(matrixA, matrixB);

		StringBuilder stringBuilder = new StringBuilder();
		for(int i = 0; i < resultMatrix.length; i++) {
			for(int j = 0; j < resultMatrix[0].length; j++) {
				stringBuilder.append(resultMatrix[i][j]).append(" ");
			}
			stringBuilder.append("\n");
		}

		System.out.println(stringBuilder);
	}

	private static int[][] matrix(BufferedReader bufferedReader) throws IOException {
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());

		int[][] matrix = new int[N][M];
		for(int i = 0; i < N; i++){
			StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
			for(int j = 0; j < M; j++){
				matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		return matrix;
	}

	private static int[][] mul(int[][] a, int[][] b) {
		int n = a.length;
		int m = b[0].length;
		int x = b.length;
		int resultMatrix[][] = new int[n][m];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++){
				for(int k = 0; k < x; k++){
					resultMatrix[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		return resultMatrix;
	}
}
