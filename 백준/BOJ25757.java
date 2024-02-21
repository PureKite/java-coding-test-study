import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ25757 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        String game = stringTokenizer.nextToken();

        Set<String> nameSet = new HashSet<>();
        for(int i = 0; i < N; i++){
            nameSet.add(bufferedReader.readLine());
        }

        if(game.equals("Y")){
            System.out.println(nameSet.size());
        }else if(game.equals("F")){
            System.out.println(nameSet.size() / 2);
        }else{
            System.out.println(nameSet.size() / 3);
        }
    }
}
