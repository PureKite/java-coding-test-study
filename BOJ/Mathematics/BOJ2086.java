import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2086 {
	public static long[][] original;
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		long a = Long.parseLong(stringTokenizer.nextToken());
		long b = Long.parseLong(stringTokenizer.nextToken());

		original = new long[][]{{1, 1}, {1, 0}};

		long[][] resultA = pow(a, original);
		long[][] resultB = pow(b + 1, original);
		System.out.println((resultB[0][0] - resultA[0][0] + 1000000000) % 1000000000);
	}

	public static long[][] mul(long[][] a, long[][] b){
		int n = a.length;
		long[][] resultMatrix = new long[n][n];

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					resultMatrix[i][j] += (a[i][k] * b[k][j]);
				}
				resultMatrix[i][j] %= 1000000000;
			}
		}

		return resultMatrix;
	}
	public static long[][] pow(long n, long[][] matrix){
		if (n == 1L) {
			return matrix;
		}

		long[][] m = pow(n / 2, matrix);
		m = mul(m, m);

		if(n % 2 == 1L){
			m = mul(m, original);
		}

		return m;
	}
}
