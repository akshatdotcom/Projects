// HW due 1/16

import java.util.Scanner;
import java.text.DecimalFormat;

public class ChangeCalc {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.print("What is the total cost? ");
        float totalCost = sc.nextFloat();
        System.out.print("How much did you pay? ");
        float moneyPaid = sc.nextFloat();
        float changeDue = moneyPaid - totalCost;
        System.out.println("Are you big brain? (Y/N)");
        boolean test = false;
        String tempAns = sc.next();
        if(tempAns.equals("Y") || tempAns.equals("y")) {
            test = true;
        }

        int twenty = 0;
        int ten = 0;
        int five = 0;
        int one = 0;
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;

        String answer = "";

        System.out.println("Change Due: " + df.format(changeDue));


        twenty += (int) changeDue / 20;
        changeDue %= 20;

        ten += (int) changeDue / 10;
        changeDue %= 10;

        five += (int) changeDue / 5;
        changeDue %= 5;

        one += (int) changeDue / 1;
        changeDue %= 1;

        quarter += (int) (changeDue / .25);
        changeDue %= .25;

        dime += (int) (changeDue / .1);
        changeDue %= .1;

        nickel += (int) (changeDue / .05);
        changeDue %= .05;

        penny += (int) (changeDue / .01);
        changeDue %= .01;


        for(int i = 0; i < twenty; i++) {
            answer += "$20, ";
        }
        for(int i = 0; i < ten; i++) {
            answer += "$10, ";
        }
        for(int i = 0; i < five; i++) {
            answer += "$5, ";
        }
        for(int i = 0; i < one; i++) {
            answer += "$1, ";
        }
        for(int i = 0; i < quarter; i++) {
            answer += "$0.25, ";
        }
        for(int i = 0; i < dime; i++) {
            answer += "$0.10, ";
        }
        for(int i = 0; i < nickel; i++) {
            answer += "$0.05, ";
        }
        for(int i = 0; i < penny; i++) {
            answer += "$0.01, ";
        }
        System.out.println();
        if(!test) {
            answer = answer.substring(0, answer.length() - 2);
            System.out.println(answer);
        } else {
            System.out.println(twenty + " x $20");
            System.out.println(ten + " x $10");
            System.out.println(five + " x $5");
            System.out.println(one + " x $1");
            System.out.println(quarter + " x $0.25");
            System.out.println(dime + " x $0.10");
            System.out.println(nickel + " x $0.05");
            System.out.println(penny + " x $0.01");

        }
    }
}