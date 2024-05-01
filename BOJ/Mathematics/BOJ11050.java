import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11050 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int n = Integer.parseInt(stringTokenizer.nextToken());
		int k = Integer.parseInt(stringTokenizer.nextToken());

		int total = 1;

		for (int i = 1; i <= k; i++) {
			total *= n;
			total /= i;
			n--;
		}

		System.out.println(total);
	}
}
