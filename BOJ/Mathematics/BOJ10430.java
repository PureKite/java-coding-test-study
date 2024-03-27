import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10430 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		int a = Integer.parseInt(stringTokenizer.nextToken());
		int b = Integer.parseInt(stringTokenizer.nextToken());
		int c = Integer.parseInt(stringTokenizer.nextToken());

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append((a + b) % c).append("\n");
		stringBuffer.append(((a % c) + (b % c)) % c).append("\n");
		stringBuffer.append((a * b) % c).append("\n");
		stringBuffer.append(((a % c) * (b % c)) % c);

		System.out.println(stringBuffer);
	}
}
