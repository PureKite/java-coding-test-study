import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1205 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int newScore = Integer.parseInt(stringTokenizer.nextToken());
        int P = Integer.parseInt(stringTokenizer.nextToken());

        int count = 1;

        if(0 < N){
            StringTokenizer scores = new StringTokenizer(bufferedReader.readLine());

            if(N < P){
                for(int i = 0; i < N; i++){
                    if(newScore < Integer.parseInt(scores.nextToken())){
                        count++;
                    }
                }
            }else if(N == P){
                int score = 0;
                for(int i = 0; i < N; i++){
                    score = Integer.parseInt(scores.nextToken());
                    if(newScore < score){
                        count++;
                    }
                }
                if(newScore == score || count > N){
                    count = -1;
                }
            }
        }
        System.out.println(count);
    }
}
