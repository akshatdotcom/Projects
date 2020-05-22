import java.io.*;

public class Prob837A {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));

        int numLetters = Integer.parseInt(f.readLine());
        String[] words = f.readLine().split(" ");
        int[] volumes = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            int volume = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if(words[i].charAt(j) >= 65 && words[i].charAt(j) <= 90) {
                    volume++;
                }
            }
            volumes[i] = volume;
        }
        int max = 0;
        for (int volume :
                volumes) {
            if(volume > max) {
                max = volume;
            }
        }
        out.println(max);

        out.close();
    }
}
