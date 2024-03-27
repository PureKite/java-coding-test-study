import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1850 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		long x = Long.parseLong(stringTokenizer.nextToken());
		long y = Long.parseLong(stringTokenizer.nextToken());

		long gcd = gcd(x, y);

		String answer = "1".repeat((int) gcd);

		System.out.println(answer);
	}

	public static long gcd(long x, long y) {
		if (y == 0) {
			return x;
		}

		return gcd(y, x % y);
	}
}
