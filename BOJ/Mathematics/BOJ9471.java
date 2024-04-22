import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9471 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int p = Integer.parseInt(bufferedReader.readLine());

		for(int i = 0; i < p; i++){
			StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			System.out.println(n + " " + period(m));
		}
	}

	private static int period(int mod){
		int f1 = 1, f2 = 1, f3;
		int period = 0;

		while(true){
			f3 = (f1 + f2) % mod;
			f1 = f2;
			f2 = f3;

			period++;

			if(f1 == 1 && f2 == 1){
				return period;
			}
		}
	}
}
