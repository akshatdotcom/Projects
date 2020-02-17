/*
PROG: ride
ID: aksshah1
TASK: test
LANG: JAVA
 */

import java.io.*;

class ride {

    public static void main(String[] args) {
        BufferedReader f = new BufferedReader(new FileReader("file.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("file.out")));
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        String comet = sc.next().toLowerCase().trim();
        String star = sc.next().toLowerCase().trim();

        long sum1 = 1;
        long sum2 = 1;

        for(int i = 0; i < comet.length(); i++) {
            sum1 *= alpha.indexOf(comet.charAt(i)) + 1;
        }

        for(int i = 0; i < star.length(); i++) {
            sum2 *= alpha.indexOf(star.charAt(i)) + 1;
        }

        if(sum1 % 47 == sum2 % 47) {
            System.out.println("GO");
        } else {
            System.out.println("STAY");
        }
    }
}
