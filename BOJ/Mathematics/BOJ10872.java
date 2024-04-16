import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());

		int[] factorial = new int[n + 1];
		factorial[0] = 1;

		for(int i = 1; i <= n; i++) {
			factorial[i] = i * factorial[i-1];
		}

		System.out.println(factorial[n]);
	}
}
