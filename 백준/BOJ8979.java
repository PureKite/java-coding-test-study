import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        int[][] countryMedal = new int[N][3];
        int[] solution = new int[3];
        for(int i = 0; i < N; i++){
            StringTokenizer info = new StringTokenizer(bufferedReader.readLine());

            int countryNum = Integer.parseInt(info.nextToken()) - 1;
            int gold = Integer.parseInt(info.nextToken());
            int silver = Integer.parseInt(info.nextToken());
            int bronze = Integer.parseInt(info.nextToken());

            countryMedal[countryNum][0] = gold;
            countryMedal[countryNum][1] = silver;
            countryMedal[countryNum][2] = bronze;

            if(countryNum == K-1){
                solution = countryMedal[countryNum];
            }
        }
        Arrays.sort(countryMedal, (o1, o2) -> {
            if(o1[0] == o2[0]){
                if(o1[1] == o2[1]){
                    return o2[2] - o1[2];
                }
                return o2[1] - o1[1];
            }
            return o2[0] - o1[0];
        });

        int rank = 1;
        for(int[] medal : countryMedal){
            if(Arrays.equals(medal, solution)){
                System.out.println(rank);
                break;
            }
            rank++;
        }
    }
}
