import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ3758 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer();
        int T = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < T; i++){
            StringTokenizer testCase = new StringTokenizer(bufferedReader.readLine());

            int n = Integer.parseInt(testCase.nextToken());
            int k = Integer.parseInt(testCase.nextToken());
            int t = Integer.parseInt(testCase.nextToken());
            int m = Integer.parseInt(testCase.nextToken());

            int[] count = new int[n+1];
            int[][] scores = new int[n+1][k+1];
            int[] time = new int[n+1];
            int[] sum = new int[n+1];
            HashMap<Integer, Integer> rank = new HashMap<>();
            for(int j = 0; j < m; j++){
                StringTokenizer testData = new StringTokenizer(bufferedReader.readLine());
                int id = Integer.parseInt(testData.nextToken());
                int problemNumber = Integer.parseInt(testData.nextToken());
                int score = Integer.parseInt(testData.nextToken());

                if(scores[id][problemNumber] < score){
                    sum[id] -= scores[id][problemNumber];
                    sum[id] += score;
                    scores[id][problemNumber] = score;
                }

                time[id] = j;
                count[id]++;
            }

            for(int j = 1; j < n+1; j++){
                rank.put(j, sum[j]);
            }

            List<Integer> keySet = new ArrayList<>(rank.keySet());

            keySet.sort((o1, o2) -> {
                if(Objects.equals(rank.get(o1), rank.get(o2))){
                    if(count[o1] == count[o2]){
                        return time[o1] - time[o2];
                    }
                    return count[o1] - count[o2];
                }
                return rank.get(o2) - rank.get(o1);
            });

            stringBuffer.append(keySet.indexOf(t) + 1).append("\n");
        }
        System.out.print(stringBuffer);
    }
}