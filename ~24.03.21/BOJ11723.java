import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int M = Integer.parseInt(bufferedReader.readLine());

        boolean[] S = new boolean[21];
        for(int i = 0; i < M; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String calculator = stringTokenizer.nextToken();
            if(calculator.equals("all")){
                Arrays.fill(S, true);
                continue;
            }else if(calculator.equals("empty")){
                Arrays.fill(S, false);
                continue;
            }

            int number = Integer.parseInt(stringTokenizer.nextToken());

            if(calculator.equals("add")){
                S[number] = true;
            }else if(calculator.equals("remove")){
                S[number] = false;
            }else if(calculator.equals("check")){
                if(S[number]){
                    stringBuilder.append(1).append("\n");
                }else{
                    stringBuilder.append(0).append("\n");
                }
            }else if(calculator.equals("toggle")){
                S[number] = !S[number];
            }
        }

        System.out.println(stringBuilder);
    }
}
