package com.akshatshah;

public class Main {

    public static void main(String[] args) {


         /*
         These are the expressions from his challenge

            score = 100
            score > 99
            "You got the high score!"
            score = 0
          */



        // below is a valid Java statement
        int myVariable = 50;
        myVariable++;
        myVariable--;
        // these are also statements
        System.out.println("This was printed from a valid Java statement");

        System.out.println("This is a lot of "

                +
                "whitespace in the code but Java is smart enough to know it as whitespace and acts like there was none.");



        int anotherVariable = 50;anotherVariable--;
        // In Java, whitespace doesn't matter, so you could as many statements as you want on the same line
        // although, it looks messy and especially ugly, so make it organized by putting different statements on
        // different lines

        // whitespace makes code look good and organized, ultimately more easy to read

        // indentation is indenting a code so that it becomes more readable

        if (anotherVariable == 50) {
            System.out.println(anotherVariable);
        }


    }

}