import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ17484 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int[][] fuels = new int[N][M];
        for(int i = 0; i < N; i++){
            StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
            for(int j = 0; j < M; j++){
                fuels[i][j] = Integer.parseInt(line.nextToken());
            }
        }


    }
}
