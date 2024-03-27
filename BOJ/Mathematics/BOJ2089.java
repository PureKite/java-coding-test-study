import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2089 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());

		StringBuilder stringBuilder = new StringBuilder();
		if (n == 0) {
			stringBuilder.append(0);
		} else {
			while (n != 1){
				stringBuilder.append(Math.abs(n % -2));

				n = (int)(Math.ceil((double)n/-2));
			}
			stringBuilder.append(n);
		}
		System.out.println(stringBuilder.reverse());
	}
}
