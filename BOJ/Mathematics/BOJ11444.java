import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11444 {
	private static long[][] original;

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(bufferedReader.readLine());

		original = new long[][]{{1, 1}, {1, 0}};

		if(0 == n){
			System.out.println(0);
		}else{
			long[][] result = pow(original, n);
			System.out.println(result[0][1]);
		}
	}

	private static long[][] pow(long[][] matrix, long n) {
		if(n == 1L) {
			return matrix;
		}

		long[][] result = pow(matrix, n / 2);

		result = mul(result, result);

		if(n % 2 == 1L) {
			result = mul(result, original);
		}

		return result;
	}

	private static long[][] mul(long[][] a, long[][] b) {
		int n = a.length;
		long[][] resultMatrix = new long[n][n];

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				for(int k = 0; k < n; k++){
					resultMatrix[i][j] += (a[i][k] * b[k][j]);
				}
				resultMatrix[i][j] %= 1000000007;
			}
		}

		return resultMatrix;
	}
}
