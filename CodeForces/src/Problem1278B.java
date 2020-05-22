// http://codeforces.com/problemset/problem/1278/B

import java.util.Scanner;

// NOT SOLVED YET

public class Problem1278B {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int queries = sc.nextInt();
        long a;
        long b;
        long aFirst;
        long bFirst;
        long answer1;
        long answer2;
        int adder;
        long finalAnswer;
        for(int i = 0; i < queries; i++) {
            answer1 = 0;
            answer2 = 0;
            finalAnswer = 0;
            adder = 0;
            aFirst = sc.nextInt();
            // System.out.println("aFirst " + aFirst);
            bFirst = sc.nextInt();
            // System.out.println("bFirst " + bFirst);
            if(aFirst == bFirst) {
                finalAnswer = 0;
                System.out.println(finalAnswer);
                continue;
            }
            a = aFirst;
            b = bFirst;
            while(a != b) {
                adder++;
                a += adder;
                answer1++;
                if(a == b) break;
                adder++;
                b += adder;
                answer1++;
            }
            adder = 0;
            b = aFirst;
            a = bFirst;
            while(a != b) {
                adder++;
                a += adder;
                answer2++;
                if(a == b) break;
                adder++;
                b += adder;
                answer2++;
            }

            if(answer1 > answer2) finalAnswer = answer2;
            else if(answer1 == answer2) finalAnswer = answer1;
            else finalAnswer = answer1;
            System.out.println(finalAnswer);
        }
    }
}
