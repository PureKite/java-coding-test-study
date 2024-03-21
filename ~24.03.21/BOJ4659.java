import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ4659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while(!(line = bufferedReader.readLine()).equals("end")){
            if(possiblePassword(line)){
                stringBuilder.append("<").append(line).append("> is acceptable.\n");
            }else{
                stringBuilder.append("<").append(line).append("> is not acceptable.\n");
            }
        }
        System.out.println(stringBuilder);
    }

    private static boolean possiblePassword(String password){
        if(password.contains("a") || password.contains("e") || password.contains("i") || password.contains("o") || password.contains("u")){
            int sameCount = 0;
            int consonant = 0;
            int vowel = 0;
            List<Character> list = new ArrayList<>(List.of('a', 'o', 'e', 'i', 'u'));
            if(list.contains(password.charAt(0))){
                consonant++;
            }else{
                vowel++;
            }
            for(int i = 1; i < password.length(); i++){
                if(list.contains(password.charAt(i))){
                    consonant++;
                    vowel = 0;
                }else{
                    vowel++;
                    consonant = 0;
                }
                if(consonant == 3 || vowel == 3){
                    return false;
                }
                char before = password.charAt(i-1);
                if(before == password.charAt(i)){
                    sameCount++;
                }else{
                    sameCount = 0;
                }
                if(sameCount == 1 && password.charAt(i) != 'e' && password.charAt(i) != 'o'){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
