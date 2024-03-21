import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ17266{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int M = Integer.parseInt(bufferedReader.readLine());

        int[] lamp = new int[M];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 0; i < M; i++){
            int lampNumber = Integer.parseInt(stringTokenizer.nextToken());
            lamp[i] = lampNumber;
        }

        int count = 1;
        int left = 1;
        int right = N;

        while(left <= right){
            int middle = (left + right) / 2;

            if(allLight(lamp, middle, N)){
                count = middle;
                right = middle - 1;
            }else{
                left = middle + 1;
            }
        }

        System.out.println(count);
    }

    public static boolean allLight(int[] lamp, int mid, int N){
        int prev = 0;

        for(int i = 0; i < lamp.length; i++){
            if(lamp[i] - mid <= prev){
                prev = lamp[i] + mid;
            }else{
                return false;
            }
        }

        return N - prev <= 0;
    }
}
