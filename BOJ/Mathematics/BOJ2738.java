import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2738 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());

		int[][] matrixA = matrix(N, M, bufferedReader);
		int[][] matrixB = matrix(N, M, bufferedReader);

		StringBuilder stringBuilder = new StringBuilder();
		for(int i = 0; i < N; i++){
			for(int j = 0; j < M; j++){
				stringBuilder.append(matrixA[i][j] + matrixB[i][j]).append(" ");
			}
			stringBuilder.append("\n");
		}

		System.out.println(stringBuilder);
	}

	public static int[][] matrix(int N, int M, BufferedReader bufferedReader) throws IOException {
		int[][] matrix = new int[N][M];
		for(int i = 0; i < N; i++){
			StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
			for(int j = 0; j < M; j++){
				matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		return matrix;
	}
}
