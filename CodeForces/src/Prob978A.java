import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Prob978A {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        int max = Integer.parseInt(f.readLine());
        StringTokenizer st = new StringTokenizer(f.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < max; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
    }
}
