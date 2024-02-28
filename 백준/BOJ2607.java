import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2607 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int wordLength = Integer.parseInt(bufferedReader.readLine());

        char[] word = bufferedReader.readLine().toCharArray();

        int totalCount = 0;
        for(int i = 0; i < wordLength - 1; i++){
            char[] word2 = bufferedReader.readLine().toCharArray();

            int count = 0;
            for(int j = 0; j < word.length; j++){
                for(int k = 0; k < word2.length; k++){
                    if(word[j] == word2[k]){
                        count++;
                        word2[k] = '.';
                        break;
                    }
                }
            }

            if(count == word.length && word.length == word2.length){
                totalCount++;
            } else if(count == word.length - 1 && word2.length == word.length){
                totalCount++;
            } else if(count == word.length &&  word2.length == word.length + 1){
                totalCount++;
            } else if(count == word.length - 1 && word2.length == word.length - 1){
                totalCount++;
            }
        }

        System.out.println(totalCount);
    }
}
