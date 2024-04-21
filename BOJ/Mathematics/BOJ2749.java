import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2749 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(bufferedReader.readLine());

		int period = period();

		long[] fibo = new long[period + 1];

		fibo[0] = 0;
		fibo[1] = 1;
		for(int i = 2; i <= period; i++){
			fibo[i] = (fibo[i-2] + fibo[i-1]) % 1000000;
		}

		System.out.println(fibo[(int)(n % period)]);
	}

	private static int period(){
		int mod = 1000000;
		int f1 = 1, f2 = 1, f3;
		int period = 0;

		while (true) {
			f3 = (f1 + f2) % mod;

			f1 = f2;
			f2 = f3;
			period++;

			if(f1 == 1 && f2 == 1) {
				return period;
			}
		}
	}
}
