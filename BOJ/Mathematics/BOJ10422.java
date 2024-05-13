import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10422 {
	private static final int MOD = 1_000_000_007;
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(bufferedReader.readLine());

		long[] dp = new long[5001];
		dp[0] = 1;
		dp[2] = 1;
		for(int i = 4; i <= 5000; i+=2) {
			for(int j = 0; j < i; j+=2) {
				dp[i] += dp[j] * dp[i-j-2];
				dp[i] %= MOD;
			}
		}
		for (int i = 0; i < T; i++) {
			int L = Integer.parseInt(bufferedReader.readLine());
			System.out.println(dp[L]);
		}
	}
}
