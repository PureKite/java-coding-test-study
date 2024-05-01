import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11778 {
	private static long mod = 1_000_000_007;
	private static long[][] original;
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		long n = Long.parseLong(stringTokenizer.nextToken());
		long m = Long.parseLong(stringTokenizer.nextToken());

		original = new long[][] {{1, 1}, {1, 0}};
		long[][] matrixN = pow(original, gcd(n , m));

		System.out.println(matrixN[0][1]);
	}

	public static long[][] mul(long[][] a, long[][] b) {
		int n = a.length;
		long[][] result = new long[n][n];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
				result[i][j] %= mod;
			}
		}

		return result;
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

	public static long gcd(long n, long m) {
		if(m == 0) {
			return n;
		}

		return gcd(m, n % m);
	}
}
