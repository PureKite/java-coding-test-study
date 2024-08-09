import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15649 {
	private static int[] arr;
	private static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		arr = new int[m];
		visited = new boolean[n];

		backtracking(n, 0, m);
	}

	private static void backtracking(int n, int count, int m) {
		if(count == m) {
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			return;
		}

		for(int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[count] = i + 1;
				backtracking(n, count + 1, m);

				visited[i] = false;
			}
		}
	}
}
