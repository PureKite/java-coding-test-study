import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10431 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int P = Integer.parseInt(bufferedReader.readLine());

        while(P-- > 0){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String testNum = stringTokenizer.nextToken();
            stringBuilder.append(testNum).append(" ");

            int count = 0;
            int[] arr = new int[20];

            for(int i = 0; i < arr.length; i++){
                arr[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < i; j++){
                    if(arr[j] > arr[i]){
                        count++;
                    }
                }
            }

            System.out.println(testNum + " " + count);
        }
    }
}
