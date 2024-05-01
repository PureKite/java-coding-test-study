import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11051 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int n = Integer.parseInt(stringTokenizer.nextToken());
		int k = Integer.parseInt(stringTokenizer.nextToken());

		if(k > n - k) {
			k = n - k;
		}

		int[][] dp = new int[1001][1001];

		for(int i = 1; i <= n; i++) {
			for(int j = 0; j <= n; j++) {
				if(i == j || j == 0) {
					dp[i][j] = 1;
				}else{
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j]) % 10007;
				}
			}
		}

		System.out.println(dp[n][k]);
	}
}
