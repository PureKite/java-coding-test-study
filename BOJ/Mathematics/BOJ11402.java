import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11402 {
	public static int m;
	public static long[][] fibo;

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		long n = Long.parseLong(stringTokenizer.nextToken());
		long k = Long.parseLong(stringTokenizer.nextToken());
		m = Integer.parseInt(stringTokenizer.nextToken());

		fibonacci();

		long answer = 1;

		while (n > 0 && k > 0) {
			answer *= calculator((int)(n % m), (int)(k % m));
			n /= m;
			k /= m;
		}

		System.out.println(answer % m);
	}

	public static long calculator(int n, int k) {
		if (n < k) {
			return 0L;
		}
		if (n == 0 || n == k) {
			return 1L;
		}
		if (k > n - k) {
			k = n - k;
		}

		return fibo[n][k];
	}

	public static void fibonacci() {
		fibo = new long[m + 1][m + 1];
		for (int i = 1; i <= m; i++) {
			for (int j = 0; j <= m; j++) {
				if(j == 0 || i == j) {
					fibo[i][j] = 1;
				} else {
					fibo[i][j] = (fibo[i-1][j] + fibo[i-1][j-1]) % m;
				}
			}
		}
	}
}