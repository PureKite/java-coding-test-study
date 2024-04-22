import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1788 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine());

		int answer = 0;
		answer = fibo(Math.abs(n));
		if(n % 2 == 0 && n < 0){
			System.out.println(-1);
		} else if(n == 0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}

		System.out.println(answer);
	}

	private static int fibo(int n){
		if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		}

		int f1 = 0, f2 = 1, f3 = 1;
		for(int i = 2; i <= n; i++){
			f3 = (f1 + f2) % 1000000000;
			f1 = f2;
			f2 = f3;
		}
		return f3;
	}
}
