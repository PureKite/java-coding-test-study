import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String words = bufferedReader.readLine().toUpperCase();

        int[] alphabet = new int[26];
        int max = 0;
        int index = 0;
        int cnt = 1;

        for(int i = 0; i < words.length(); i++){
            char ch = words.charAt(i);
            alphabet[ch - 'A'] += cnt;
        }

        for(int i = 0; i < alphabet.length; i++){
            if(alphabet[i] > max){
                max = alphabet[i];
                index = i;
            }else if(alphabet[i] == max){
                index = -2;
            }
        }
        index += 65;

        System.out.println((char) index);
    }
}
