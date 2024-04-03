import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ6588 {
	public static void main(String[] args) throws IOException {
		boolean[] primes = Eratos(new boolean[1000001]);

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder stringBuilder = new StringBuilder();
		int number;
		while((number = Integer.parseInt(bufferedReader.readLine())) != 0){
			for(int i = 3; i <= number / 2; i+=2){
				if(primes[i] && primes[number - i]) {
					stringBuilder.append(number).append(" = ")
						.append(i).append(" + ").append(number-i).append("\n");
					break;
				}
			}
		}

		System.out.println(stringBuilder);
	}

	public static boolean[] Eratos(boolean[] primes){
		Arrays.fill(primes, true);

		primes[0] = false;
		primes[1] = false;

		for(int i = 2; i * i < primes.length; i++){
			if(primes[i]){
				for(int j = i * i; j < primes.length; j += i){
					primes[j] = false;
				}
			}
		}

		return primes;
	}
}
