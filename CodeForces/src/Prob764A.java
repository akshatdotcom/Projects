import java.io.*;
import java.util.StringTokenizer;

// ACCEPTED

public class Prob764A {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int killerComesIn = Integer.parseInt(st.nextToken());
        int artistComesIn = Integer.parseInt(st.nextToken());
        int minutesInDay = Integer.parseInt(st.nextToken());
        boolean[] killerArr = new boolean[minutesInDay];
        boolean[] artistArr = new boolean[minutesInDay];

        for (int i = killerComesIn; i <= minutesInDay; i += killerComesIn) {
            if(killerComesIn <= minutesInDay) {
                killerArr[i-1] = true;
            }
        }
        for (int i = artistComesIn; i <= minutesInDay; i += artistComesIn) {
            if(artistComesIn <= minutesInDay) {
                artistArr[i-1] = true;
            }
        }
        int artistKilled = 0;
        for(int i = 0; i < minutesInDay; i++) {
            if(killerArr[i] && artistArr[i]) {
                artistKilled++;
            }
        }
        out.println(artistKilled);
        out.close();
    }
}
