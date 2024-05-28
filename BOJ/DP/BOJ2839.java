import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());


		int five = n / 5;
		int three = n / 3;

		int min = Integer.MAX_VALUE;
		for(int i = 0; i <= five; i++) {
			int fiveResult = 5 * i;

			int threeResult = 1;
			for(int j = 0; j <= three; j++) {
				threeResult = 3 * j;
				if(fiveResult + threeResult == n){
					min = Math.min(min, i + j);
				}
			}
		}

		if(Integer.MAX_VALUE == min){
			System.out.println(-1);
		} else{
			System.out.println(min);
		}
	}
}
