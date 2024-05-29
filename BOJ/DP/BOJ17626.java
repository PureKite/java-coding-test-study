import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17626 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int result = fourSquares(n);

		System.out.println(result);
	}

	private static int fourSquares(int n) {
		int sqrt = (int)Math.sqrt(n);
		if(sqrt == Math.sqrt(n)){
			return 1;
		}

		for(int i = 1; i < sqrt + 1; i++){
			if((int)Math.sqrt(n - i*i) == Math.sqrt(n - i*i)){
				return 2;
			}
		}

		for(int i = 1; i < sqrt + 1; i++) {
			for(int j = 1; j < (int)Math.sqrt(n - i * i) + 1; j++) {
				if ((int)Math.sqrt(n - (i * i) - (j * j)) == Math.sqrt(n - (i * i) - (j * j))){
					return 3;
				}
			}
		}

		return 4;
	}
}
