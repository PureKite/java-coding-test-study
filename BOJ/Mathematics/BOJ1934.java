import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1934 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bufferedReader.readLine());

		for(int i = 0; i < t; i++){
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int x = Integer.parseInt(stringTokenizer.nextToken());
			int y = Integer.parseInt(stringTokenizer.nextToken());
			int gcd = gcd(x, y);
			System.out.println(x * y / gcd);
		}
	}

	public static int gcd(int x, int y){
		if(y == 0){
			return x;
		}

		return gcd(y, x % y);
	}
}
