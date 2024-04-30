import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11442 {
	private static long[][] original;
	private static long mod = 1_000_000_007;
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(bufferedReader.readLine());

		original = new long[][]{{1, 1}, {1, 0}};

		long[][] result = pow(original, n);
		if(n % 2 == 1L) {
			System.out.println(result[0][0]);
		} else{
			System.out.println(result[0][1]);
		}
	}

	public static long[][] mul(long[][] a, long[][] b){
		long[][] resultMatrix = new long[2][2];

		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				for(int k = 0; k < 2; k++){
					resultMatrix[i][j] += a[i][k] * b[k][j];
				}
				resultMatrix[i][j] %= mod;
			}
		}
		return resultMatrix;
	}

	public static long[][] pow(long[][] matrix, long n) {
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
}
