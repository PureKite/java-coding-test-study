import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1373 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(change(bufferedReader.readLine()));
	}

	public static String change(String number){
		if(number.length() % 3 == 1){
			number = "00" + number;
		}else if(number.length() % 3 == 2){
			number = "0" + number;
		}

		StringBuilder stringBuilder = new StringBuilder();
		for(int i = 0; i < number.length(); i+=3){
			int sum = 0;
			sum += (number.charAt(i) - '0') * 4;
			sum += (number.charAt(i+1) - '0') * 2;
			sum += (number.charAt(i+2) - '0') * 1;
			stringBuilder.append(sum);
		}

		return stringBuilder.toString();
	}
}
