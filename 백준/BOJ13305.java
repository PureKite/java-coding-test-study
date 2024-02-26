import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine());

        int[] distance = new int[N-1];
        int[] city = new int[N];

        for(int i = 0; i < N-1; i++){
            distance[i] = Integer.parseInt(stringTokenizer1.nextToken());
        }

        StringTokenizer stringTokenizer2 = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < N; i++){
            city[i] = Integer.parseInt(stringTokenizer2.nextToken());
        }

        long sum = 0;
        long minCityCost = city[0];
        for(int i = 1; i < N; i++){
            sum += minCityCost * distance[i - 1];
            if(minCityCost > city[i]){
                minCityCost = city[i];
            }
        }

        System.out.println(sum);
    }
}
