/*
ID: aksshah1
LANG: JAVA
PROG: ride
 */

import java.io.*;

class ride {

    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
//        StringTokenizer st = new StringTokenizer(f.readLine());

        String alpha = "abcdefghijklmnopqrstuvwxyz";

        String comet = f.readLine().toLowerCase().trim();

//        st = new StringTokenizer(f.readLine());
        String star = f.readLine().toLowerCase().trim();

        long sum1 = 1;
        long sum2 = 1;

        for(int i = 0; i < comet.length(); i++) {
            sum1 *= alpha.indexOf(comet.charAt(i)) + 1;
        }

        for(int i = 0; i < star.length(); i++) {
            sum2 *= alpha.indexOf(star.charAt(i)) + 1;
        }

        if(sum1 % 47 == sum2 % 47) {
            out.println("GO");
        } else {
            out.println("STAY");
        }

        out.close();
    }
}
