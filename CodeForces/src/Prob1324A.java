import java.io.*;
import java.util.StringTokenizer;

// ACCEPTED, 1ST CONTEST PROBLEM SOLVED (GOT RATING)

public class Prob1324A {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        int cases = Integer.parseInt(f.readLine());
        for (int i = 0; i < cases; i++) {
            int col = Integer.parseInt(f.readLine());
            StringTokenizer st = new StringTokenizer(f.readLine());
            int[] colHeight = new int[col];
            for(int j = 0; j < colHeight.length; j++) {
                colHeight[j] = Integer.parseInt(st.nextToken());
            }
            int counter = 0;
            boolean flag = true;
            while(oneHeightPositive(colHeight)) {
                int tempPosition = findZeroPosition(colHeight);
                if(tempPosition >= 0) {
                    colHeight[tempPosition] += 2;
                } else {
                    colHeight[0] += 2;
                }
                while(allHeightPositive(colHeight)) {
                    for(int k = 0; k < colHeight.length; k++) {
                        colHeight[k]--;
                    }
                }
                if(counter > 10000) {
                    flag = false;
                    break;
                }
                counter++;
            }
            out.println(flag ? "YES" : "NO");
        }

        out.close();

    }

    public static boolean oneHeightPositive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean allHeightPositive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= 0) {
                return false;
            }
        }
        return true;
    }

    public static int findZeroPosition(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static boolean allAreZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
