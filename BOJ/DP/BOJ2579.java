import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2579 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] data = new int[n+1];
		for(int i = 1; i <= n; i++){
			data[i] = Integer.parseInt(br.readLine());
		}


		if(n == 1){
			System.out.println(data[1]);
		} else if(n == 2){
			System.out.println(data[1] + data[2]);
		} else{
			int[] dp = new int[n+2];
			dp[1] = data[1];
			dp[2] = data[1] + data[2];
			for(int i = 3; i <= n; i++){
				dp[i] = Math.max(data[i] + data[i-1] + dp[i-3], data[i] + dp[i-2]);
			}
			System.out.println(dp[n]);
		}

	}
}
