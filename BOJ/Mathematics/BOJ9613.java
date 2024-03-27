import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9613 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bufferedReader.readLine());

		StringBuilder stringBuilder = new StringBuilder();
		for(int i = 0; i < testCase; i++){
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int n = Integer.parseInt(stringTokenizer.nextToken());
			int[] test = new int[n];
			for(int j = 0; j < n; j++){
				test[j] = Integer.parseInt(stringTokenizer.nextToken());
			}

			stringBuilder.append(checkSum(test)).append("\n");

		}

		System.out.println(stringBuilder);
	}

	public static long checkSum(int[] test){
		long result = 0;

		for(int i = 0; i < test.length; i++){
			for(int j = i + 1; j < test.length; j++){
				result += gcd(test[i], test[j]);
			}
		}

		return result;
	}

	public static int gcd(int x, int y){
		if(y == 0){
			return x;
		}

		return gcd(y, x % y);
	}
}
