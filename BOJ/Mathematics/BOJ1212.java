import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1212 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String number = bufferedReader.readLine();

		String answer = change(number);

		System.out.println(removeZero(answer));
	}

	public static String change(String number){
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < number.length(); i++){
			int testNumber = number.charAt(i) - '0';
			result.append(testNumber / 4);
			testNumber %= 4;
			result.append(testNumber / 2);
			result.append(testNumber % 2);
		}

		return result.toString();
	}

	public static String removeZero(String number){
		for(int i = 0; i < number.length(); i++){
			if(number.charAt(0) == '0'){
				number = number.replaceFirst("0", "");
			}else{
				break;
			}
		}

		return number;
	}
}
