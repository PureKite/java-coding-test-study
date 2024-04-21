import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2748 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine());

		long[] fibo = new long[n+1];
		fibo[0] = 0;
		fibo[1] = 1;

		for(int i = 2; i <= n; i++){
			fibo[i] = fibo[i-1] + fibo[i-2];
		}

		System.out.println(fibo[n]);
	}
}
