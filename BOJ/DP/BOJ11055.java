import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11055 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] data = new int[n];
		int[] dp = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = Integer.parseInt(st.nextToken());
			dp[i] = 1;
		}

		dp[0] = data[0];
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < i; j++) {
				if(data[j] < data[i]) {
					dp[i] = Math.max(dp[i], dp[j] + data[i]);
				} else{
					dp[i] = Math.max(dp[i], data[i]);
				}
			}
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}
