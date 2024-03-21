import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());

        int[][] person = new int[N][2];
        for(int i = 0; i < N; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            person[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            person[i][1] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int i = 0; i < N; i++){
            int rank = 1;
            for(int j = 0; j < N; j++){
                if(i == j){
                    continue;
                }
                if(person[i][0] < person[j][0] && person[i][1] < person[j][1]){
                    rank++;
                }
            }
            stringBuilder.append(rank).append(" ");
        }

        System.out.println(stringBuilder);
    }
}
