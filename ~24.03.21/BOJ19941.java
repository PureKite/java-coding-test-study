import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ19941 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        char[] location = bufferedReader.readLine().toCharArray();

        int count = 0;
        for(int i = 0; i < N; i++){
            if(location[i] == 'P'){
                for(int j = i-K; j < i + K +1; j++){
                    if(j < 0 || j >= N){
                        continue;
                    }
                    if(location[j] == 'H'){
                        location[j] = 'E';
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
