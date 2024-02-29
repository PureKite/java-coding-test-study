import java.io.*;

public class BOJ20310 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] stringArray = bufferedReader.readLine().toCharArray();


        for(int i = 0; i < stringArray.length; i++){
            if(stringArray[i] == '0'){
                for(int j = stringArray.length-1; j >= 0; j--) {
                    if (stringArray[j] == '0') {
                        stringArray[j] = '.';
                        break;
                    }
                }
            }
        }

        for(int i = stringArray.length-1; i >= 0; i--){
            if(stringArray[i] == '1'){
                for(int j = 0; j < stringArray.length; j++){
                    if (stringArray[j] == '1') {
                        stringArray[j] = '.';
                        break;
                    }
                }
            }
        }

        for(int i = 0; i < stringArray.length; i++){
            if(stringArray[i] != '.'){
                bufferedWriter.write(stringArray[i]);
            }
        }


        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
