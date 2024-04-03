import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11576 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer firstLine = new StringTokenizer(bufferedReader.readLine());
		int A = Integer.parseInt(firstLine.nextToken());
		int B = Integer.parseInt(firstLine.nextToken());

		int m = Integer.parseInt(bufferedReader.readLine());

		int[] numbers = new int[m];

		StringTokenizer number = new StringTokenizer(bufferedReader.readLine());
		for(int i = 0; i < m; i++){
			numbers[i] = Integer.parseInt(number.nextToken());
		}

		int decimal = changeDecimal(numbers, A);

		StringBuilder changeNumber = decimalChange(B, decimal);

		String[] result = changeNumber.toString().split(" ");
		StringBuilder answer = new StringBuilder();
		for(int i = result.length - 1; i >= 0; i--){
			answer.append(result[i]).append(" ");
		}

		System.out.println(answer);
	}

	public static int changeDecimal(int[] numbers, int A){
		int result = 0;
		int count = 1;
		for(int i = numbers.length - 1; i >= 0; i--){
			result += numbers[i] * count;
			count *= A;
		}

		return result;
	}

	public static StringBuilder decimalChange(int B, int decimal){
		StringBuilder stringBuilder = new StringBuilder();
		while (decimal > 0){
			stringBuilder.append(decimal % B).append(" ");
			decimal /= B;
		}

		return stringBuilder;
	}
}
