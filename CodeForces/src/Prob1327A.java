import java.io.*;
import java.util.StringTokenizer;

// INCOMPLETE

public class Prob1327A {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        StringTokenizer st;
        long tests = Integer.parseInt(f.readLine());

        for(long i = 1; i <= tests; i++) {
            st = new StringTokenizer(f.readLine());
            long one = Long.parseLong(st.nextToken());
            long two = Long.parseLong(st.nextToken());
            long sum = one + two;
            out.println(sum % 2 == 0 ? "YES" : "NO");
        }
        out.close();
    }
}
