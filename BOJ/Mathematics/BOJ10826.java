import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ10826 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());

		BigInteger f1 = BigInteger.ZERO;
		BigInteger f2 = BigInteger.ONE;
		if (n == 0) {
			System.out.println(f1);
		} else if (n == 1) {
			System.out.println(f2);
		} else {
			BigInteger f3 = BigInteger.ONE;
			for(int i = 2; i <= n; i++) {
				f3 = f1.add(f2);
				f1 = f2;
				f2 = f3;
			}

			System.out.println(f3);
		}
	}
}