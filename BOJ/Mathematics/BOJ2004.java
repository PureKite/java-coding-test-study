import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2004 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int countTwo = 0;
		int countFive = 0;

		for (long i = 2; i <= n; i *= 2) {
			countTwo += n / i;
		}
		for (long i = 2; i <= m; i *= 2) {
			countTwo -= m / i;
		}
		for (long i = 2; i <= n - m; i *= 2) {
			countTwo -= (n - m) / i;
		}

		for (long i = 5; i <= n; i *= 5) {
			countFive += n / i;
		}
		for (long i = 5; i <= m; i *= 5) {
			countFive -= m / i;
		}
		for (long i = 5; i <= n - m; i *= 5) {
			countFive -= (n - m) / i;
		}

		System.out.println(Math.min(countTwo, countFive));
	}
}
