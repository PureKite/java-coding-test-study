import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11653 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 2; i * i <= n; i++) {
			while(n % i == 0) {
				stringBuilder.append(i).append("\n");
				n /= i;
			}
		}

		if(n != 1){
			stringBuilder.append(n);
		}
		System.out.println(stringBuilder);
	}
}