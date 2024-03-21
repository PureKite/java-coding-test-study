import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9017 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < T; i++){
            int[][] teamRank = new int[201][6];
            int[] teamCount = new int[201];

            int N = Integer.parseInt(bufferedReader.readLine());
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int[] team = new int[N];

            for(int j = 0; j < N; j++){
                int teamNumber = Integer.parseInt(stringTokenizer.nextToken());

                team[j] = teamNumber;
                teamCount[teamNumber]++;
            }

            int score = 1;
            int[] teamArrayNumber = new int[201];
            for(int j = 0; j < N; j++){
                if(teamCount[team[j]] >= 6){
                    teamRank[team[j]][teamArrayNumber[team[j]]] = score;
                    teamArrayNumber[team[j]]++;
                    score++;
                }
            }

            int winnerRank = Integer.MAX_VALUE;
            int winnerNumber = 0;
            for(int j = 1; j < 201; j++){
                int teamSum = teamRank[j][0] + teamRank[j][1] + teamRank[j][2] + teamRank[j][3];
                if(teamCount[j] >= 6 && winnerRank >= teamSum){
                    if(winnerRank == teamSum){
                        if(teamRank[j][4] > teamRank[winnerNumber][4]){
                            continue;
                        }
                    }

                    winnerRank = teamSum;
                    winnerNumber = j;
                }
            }

            System.out.println(winnerNumber);
        }
    }
}
