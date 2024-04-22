import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine());

		int f1 = 0, f2 = 1, f3 = 1;

		if(n == 0) {
			System.out.println(f1);
		} else if(n == 1) {
			System.out.println(f2);
		} else{
			for(int i = 2; i <= n; i++){
				f3 = f1 + f2;
				f1 = f2;
				f2 = f3;
			}
			System.out.println(f3);
		}

	}
}
