import java.io.*;
import java.util.StringTokenizer;

public class Prob171A {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        StringTokenizer st = new StringTokenizer(f.readLine());
        out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()));
        out.close();
    }
}
