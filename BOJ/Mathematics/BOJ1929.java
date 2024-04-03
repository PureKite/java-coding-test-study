import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer numbers = new StringTokenizer(bufferedReader.readLine());

		int n = Integer.parseInt(numbers.nextToken());
		int m = Integer.parseInt(numbers.nextToken());

		boolean[] primes = new boolean[1000001];
		Arrays.fill(primes, true);

		boolean[] result = prime(primes);

		StringBuilder stringBuilder = new StringBuilder();
		for(int i = n; i < m + 1; i++){
			if(result[i]){
				stringBuilder.append(i).append("\n");
			}
		}

		System.out.println(stringBuilder);
	}

	public static boolean[] prime(boolean[] primes){
		primes[0] = false;
		primes[1] = false;

		for(int i = 2; i < primes.length; i++){
			if(primes[2]){
				for(int j = i + i; j < primes.length; j+=i){
					primes[j] = false;
				}
			}
		}

		return primes;
	}
}
