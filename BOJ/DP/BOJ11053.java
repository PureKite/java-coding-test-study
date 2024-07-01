import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] seq = new int[n];
		int[] LIS = new int[n];

		for(int i = 0; i < n; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}

		LIS[0] = seq[0];
		int index = 1;

		for(int i = 1; i < n; i++){
			if(LIS[index - 1] < seq[i]) LIS[index++] = seq[i];
			else if(LIS[0] > seq[i]) LIS[0] = seq[i];
			else{
				int tmp = Arrays.binarySearch(LIS, 0, index, seq[i]);
				LIS[tmp < 0 ? -(tmp+1) : tmp] = seq[i];
			}
		}

		System.out.println(index);
	}
}
