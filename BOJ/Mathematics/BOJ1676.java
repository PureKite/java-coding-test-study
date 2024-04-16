import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1676 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());

		int two_count = 0;
		int five_count = 0;

		for(int i = 2; i <= n; i++) {
			int number = i;
			while (number % 2 == 0){
				two_count++;
				number /= 2;
			}
			while (number % 5 == 0) {
				five_count++;
				number /= 5;
			}
		}

		System.out.println(Math.min(two_count, five_count));
	}
}
