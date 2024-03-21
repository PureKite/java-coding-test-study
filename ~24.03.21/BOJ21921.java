import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ21921 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int X = Integer.parseInt(stringTokenizer.nextToken());

        StringTokenizer numbers = new StringTokenizer(bufferedReader.readLine());
        int[] visitorCount = new int[N];
        int current = 0;
        for(int i = 0 ; i < N; i++){
            visitorCount[i] = Integer.parseInt(numbers.nextToken());
            if(i < X){
                current += visitorCount[i];
            }
        }

        int max = current;
        int count = 1;

        for(int i = 1; i < N - X + 1; i++){
            current = current - visitorCount[i - 1] + visitorCount[i + X - 1];

            if(max == current){
                count++;
            }else if(current > max){
                max = current;
                count = 1;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        if(max == 0){
            stringBuilder.append("SAD");
        }else{
            stringBuilder.append(max).append("\n").append(count);
        }

        System.out.println(stringBuilder);
    }
}
