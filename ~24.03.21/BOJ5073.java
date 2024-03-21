import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while((line = bufferedReader.readLine()) != null){
            StringTokenizer stringTokenizer = new StringTokenizer(line);
            int edges[] = new int[3];
            edges[0] = Integer.parseInt(stringTokenizer.nextToken());
            edges[1] = Integer.parseInt(stringTokenizer.nextToken());
            edges[2] = Integer.parseInt(stringTokenizer.nextToken());

            Arrays.sort(edges);

            if(edges[0] + edges[1] + edges[2] == 0){
                break;
            }else if(edges[2] >= (edges[0] + edges[1])){
                System.out.println("Invalid");
            }else if(edges[0] == edges[1] && edges[1] == edges[2]){
                System.out.println("Equilateral");
            }else if(edges[0] == edges[1] || edges[1] == edges[2] || edges[0] == edges[2]){
                System.out.println("Isosceles");
            }else{
                System.out.println("Scalene");
            }
        }
    }
}
