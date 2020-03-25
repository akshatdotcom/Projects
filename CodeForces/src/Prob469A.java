import java.io.*;
import java.util.*;

public class Prob469A {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        StringTokenizer st;

        int levelToPass = Integer.parseInt(f.readLine());
        ArrayList<Integer> levelsDone = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(f.readLine());
            st.nextToken();
            while (st.hasMoreTokens()) {
                levelsDone.add(Integer.parseInt(st.nextToken()));
            }
        }
        boolean flag = true;
        for (int i = 1; i <= levelToPass; i++) {
            if(!levelsDone.contains(i)) {
                flag = false;
                break;
            }
        }
        out.println(flag ? "I become the guy." : "Oh, my keyboard!");
        out.close();
    }
}
