import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1515 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String number = bufferedReader.readLine();

        int index = 0;
        int pos = 0;
        while (index++ <= 30000){
            String compareNum = String.valueOf(index);

            for(int i = 0; i < compareNum.length(); i++){
                if(compareNum.charAt(i) == number.charAt(pos)){
                    pos++;
                }

                if(pos == number.length()){
                    System.out.println(index);
                    return;
                }
            }
        }
    }
}
