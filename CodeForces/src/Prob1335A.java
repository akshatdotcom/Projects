import java.io.*;

// ACCEPTED

public class Prob1335A {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        long tests = Long.parseLong(f.readLine());
        for(long i = 0; i < tests; i++) {
            long temp = Long.parseLong(f.readLine());
            long ans = 0;
            if(temp > 2) {
                ans = (temp-1) / 2;
            }
            out.println(ans);
        }

        out.close();
    }
}
