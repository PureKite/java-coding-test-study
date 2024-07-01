import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1912 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] data = new int[n];

		for(int i = 0; i < n; i++){
			data[i] = Integer.parseInt(st.nextToken());
		}

		for(int i = 1; i < n; i++){
			data[i] = Math.max(data[i], data[i] + data[i-1]);
		}

		int max = data[0];
		for(int i = 0; i < n; i++) {
			max = Math.max(max, data[i]);
		}
		System.out.println(max);
	}
}
