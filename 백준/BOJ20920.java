import java.io.*;
import java.util.*;

public class BOJ20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        Map<String, Integer> words = new HashMap<>();

        for(int i = 0; i < N; i++){
            String word = bufferedReader.readLine();

            if(word.length() >= M){
                if(words.containsKey(word)){
                    words.put(word, words.get(word)+1);
                }else{
                    words.put(word, 1);
                }
            }
        }

        List<String> wordDictionary = new ArrayList<>(words.keySet());

        wordDictionary.sort((o1, o2) -> {
            if(Objects.equals(words.get(o1), words.get(o2))){
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                return o2.length() - o1.length();
            }
            return words.get(o2).compareTo(words.get(o1));
        });

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for(String key : wordDictionary){
            bufferedWriter.write(key + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
