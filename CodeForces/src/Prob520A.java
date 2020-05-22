import java.util.Scanner;

public class Prob520A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        if(n < 26) {
            System.out.println("NO");
        } else {
            String temp = sc.next();
            temp = temp.toLowerCase();

            boolean aHere = false;
            boolean bHere = false;
            boolean cHere = false;
            boolean dHere = false;
            boolean eHere = false;
            boolean fHere = false;
            boolean gHere = false;
            boolean hHere = false;
            boolean iHere = false;
            boolean jHere = false;
            boolean kHere = false;
            boolean lHere = false;
            boolean mHere = false;
            boolean nHere = false;
            boolean oHere = false;
            boolean pHere = false;
            boolean qHere = false;
            boolean rHere = false;
            boolean sHere = false;
            boolean tHere = false;
            boolean uHere = false;
            boolean vHere = false;
            boolean wHere = false;
            boolean xHere = false;
            boolean yHere = false;
            boolean zHere = false;

            if(temp.contains("a")) aHere = true;
            if(temp.contains("b")) bHere = true;
            if(temp.contains("c")) cHere = true;
            if(temp.contains("d")) dHere = true;
            if(temp.contains("e")) eHere = true;
            if(temp.contains("f")) fHere = true;
            if(temp.contains("g")) gHere = true;
            if(temp.contains("h")) hHere = true;
            if(temp.contains("i")) iHere = true;
            if(temp.contains("j")) jHere = true;
            if(temp.contains("k")) kHere = true;
            if(temp.contains("l")) lHere = true;
            if(temp.contains("m")) mHere = true;
            if(temp.contains("n")) nHere = true;
            if(temp.contains("o")) oHere = true;
            if(temp.contains("p")) pHere = true;
            if(temp.contains("q")) qHere = true;
            if(temp.contains("r")) rHere = true;
            if(temp.contains("s")) sHere = true;
            if(temp.contains("t")) tHere = true;
            if(temp.contains("u")) uHere = true;
            if(temp.contains("v")) vHere = true;
            if(temp.contains("w")) wHere = true;
            if(temp.contains("x")) xHere = true;
            if(temp.contains("y")) yHere = true;
            if(temp.contains("z")) zHere = true;

            if(aHere && bHere && cHere && dHere && eHere && fHere && gHere && hHere && iHere && jHere && kHere && lHere && mHere && nHere && oHere && pHere && qHere && rHere && sHere && tHere && uHere && vHere && wHere && xHere && yHere && zHere) {
                System.out.println("YES");
            } else System.out.println("NO");

        }
    }
}
