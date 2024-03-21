import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int switchCount = Integer.parseInt(bufferedReader.readLine());

        boolean[] switches = new boolean[switchCount+1];

        String[] line = bufferedReader.readLine().split(" ");

        for(int i = 0; i < line.length; i++){
            if(line[i].equals("0")){
                switches[i+1] = false;
            }else{
                switches[i+1] = true;
            }
        }

        int studentCount = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < studentCount; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            String gender = stringTokenizer.nextToken();
            int switchNumber = Integer.parseInt(stringTokenizer.nextToken());

            if(gender.equals("1")){
                for(int j = switchNumber; j <= switchCount; j+=switchNumber){
                    switches[j] = !switches[j];
                }
            }else{
                int left = switchNumber - 1;
                int right = switchNumber + 1;
                while(true){
                    if(1 > left || left > switchCount || right < 1 || right > switchCount){
                        break;
                    }

                    if(switches[left] != switches[right]){
                        break;
                    }

                    left--;
                    right++;
                }

                for(int j = left+1; j <= right-1; j++){
                    switches[j] = !switches[j];
                }
            }
        }

        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 1; i < switchCount + 1; i++){
            if(switches[i]){
                stringBuffer.append(1).append(" ");
            }else{
                stringBuffer.append(0).append(" ");
            }
            if(i % 20 == 0){
                stringBuffer.append("\n");
            }
        }

        System.out.println(stringBuffer);
    }
}
