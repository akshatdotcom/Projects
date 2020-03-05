import java.io.*;
import java.util.StringTokenizer;

// ACCEPTED

public class Prob155A {
    public static void main(String[] args) throws IOException {
        int amazing = 0;
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));

        int loop = Integer.parseInt(f.readLine());
//        out.println("Loop: " + loop);
        StringTokenizer st = new StringTokenizer(f.readLine());
        int temp = Integer.parseInt(st.nextToken());
//        out.println("Temp: " + temp);
        int best = temp;
        int worst = temp;
        for(int i = 1; i < loop; i++) {
            temp = Integer.parseInt(st.nextToken());
            if (temp > best) {
                best = temp;
                amazing++;
            }
            if (temp < worst) {
                worst = temp;
                amazing++;
            }
        }
        out.println(amazing);
        out.close();
    }
}
