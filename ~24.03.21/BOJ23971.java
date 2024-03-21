import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ23971 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bufferedReader.readLine().split(" ");

        int H = Integer.parseInt(input[0]);
        int W = Integer.parseInt(input[1]);
        int N = Integer.parseInt(input[2]);
        int M = Integer.parseInt(input[3]);

        int countH = H % (N + 1) > 0 ? H / (N + 1) + 1 : H / (N + 1);
        int countW = W % (M + 1) > 0 ? W / (M + 1) + 1 : W / (M + 1);

        System.out.println(countH * countW);
    }
}
