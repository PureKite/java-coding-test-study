import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15651 {
	private static int[] arr;
	private static boolean[] visited;
	private static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		arr = new int[m];
		visited = new boolean[n];

		sb = new StringBuilder();

		backtracking(n, 0, m);

		System.out.println(sb);
	}

	private static void backtracking(int n, int count, int m) {
		if(count == m) {
			for(int i = 0; i < arr.length; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for(int i = 0; i < n; i++) {
			arr[count] = i + 1;
			backtracking(n, count + 1, m);
		}

	}
}
