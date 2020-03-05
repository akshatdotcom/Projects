import java.io.*;
import java.util.StringTokenizer;

// INCOMPLETE

public class Prob520B {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        StringTokenizer st = new StringTokenizer(f.readLine());

        int nReal = Integer.parseInt(st.nextToken());
        int mReal = Integer.parseInt(st.nextToken());
        int operations = 0;

        int n = nReal;
        int m = mReal;

        while(m > n) {
            operations++;
            n *= 2;
        }

        while(n > m) {
            operations++;
            n--;
        }


        int operations2 = 0;
        n = nReal;
        m = mReal;

        while(n > m/2) {
            if(n == 0) {
                operations2 = Integer.MAX_VALUE;
                break;
            }
            operations2++;
            n--;
        }

        while(m > n) {
            if(n == 0) {
                operations2 = Integer.MAX_VALUE;
                break;
            }
            operations2++;
            n *= 2;
        }


        out.println(Math.min(operations, operations2));
        out.close();
    }
}
