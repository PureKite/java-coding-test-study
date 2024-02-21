import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ20125 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());

        String[][] map = new String[N][N];
        for(int i = 0; i < N; i++){
            map[i] = bufferedReader.readLine().split("");
        }

        int heart_x = 0;
        int heart_y = 0;
        boolean isHead = false;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(map[i][j].equals("*")){
                    heart_x = i+1;
                    heart_y = j;
                    isHead = true;
                    break;
                }
            }
            if(isHead){
                break;
            }
        }

        int left_arm = 0;
        for(int y = heart_y-1; y >= 0; y--){
            if(map[heart_x][y].equals("*")){
                left_arm++;
            }else{
                break;
            }
        }
        int right_arm = 0;
        for(int y = heart_y+1; y < N; y++){
            if(map[heart_x][y].equals("*")){
                right_arm++;
            }else{
                break;
            }
        }
        int body = 0;
        for(int x = heart_x+1; x < N; x++){
            if(map[x][heart_y].equals("*")){
                body++;
            }else{
                break;
            }
        }
        int left_leg = 0;
        for(int x = heart_x+body+1; x < N; x++){
            if(map[x][heart_y-1].equals("*")){
                left_leg++;
            }else{
                break;
            }
        }
        int right_leg = 0;
        for(int x = heart_x+body+1; x < N; x++){
            if(map[x][heart_y+1].equals("*")){
                right_leg++;
            }else{
                break;
            }
        }
        stringBuilder.append(heart_x+1).append(" ").append(heart_y+1).append("\n")
                .append(left_arm).append(" ").append(right_arm).append(" ")
                .append(body).append(" ").append(left_leg).append(" ").append(right_leg);

        System.out.println(stringBuilder);
    }
}
