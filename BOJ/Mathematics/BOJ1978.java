import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		StringTokenizer numbers = new StringTokenizer(bufferedReader.readLine());

		int result = 0;
		for(int i = 0; i < n; i++){
			int number = Integer.parseInt(numbers.nextToken());
			if(prime(number)){
				result += 1;
			}
		}

		System.out.println(result);
	}

	public static boolean prime(int number){
		if(number == 1)
			return false;
		for(int i = 2; i < number; i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}
}
