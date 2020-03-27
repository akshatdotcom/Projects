import java.io.*;
import java.util.StringTokenizer;

public class Prob1328A {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        long lines = Long.parseLong(f.readLine());
        StringTokenizer st;
        for (long i = 0; i < lines; i++) {
            st = new StringTokenizer(f.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long finalNum;
            if(a % b == 0) {
                finalNum = 0;
            } else {
                finalNum = b - (a % b);
            }
            out.println(finalNum);
        }

        out.close();
    }
}
