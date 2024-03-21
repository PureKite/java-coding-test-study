import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2512 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] budget = new int[N];
        long left = 1;
        long right = 0;
        for(int i = 0; i < N; i++){
            budget[i] = Integer.parseInt(stringTokenizer.nextToken());

            if(right < budget[i]){
                right = budget[i];
            }
        }

        int totalBudget = Integer.parseInt(bufferedReader.readLine());

        while(left <= right){
            long mid = (left + right) / 2;

            long max = 0;
            for(int i = 0; i < N; i++){
                if(mid > budget[i]){
                    max += budget[i];
                }else{
                    max += mid;
                }
            }

            if(max <= totalBudget){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        System.out.println(right);
    }
}
