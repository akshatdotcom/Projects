import java.io.*;

// ACCEPTED

public class Prob133A {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        String check = f.readLine();
        boolean flag = false;
        if(check.contains("H") || check.contains("Q") || check.contains("9")) {
            flag = true;
        }
        if (flag) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        out.close();
    }
}
