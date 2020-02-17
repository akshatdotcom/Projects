import java.util.Scanner;

public class Prob118A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String word = sc.next();

        word = word.toLowerCase();

        word = word.replace("a", "");
        word = word.replace("e", "");
        word = word.replace("i", "");
        word = word.replace("o", "");
        word = word.replace("u", "");
        word = word.replace("y", "");


        word = word.replace("a", ".a");
        word = word.replace("b", ".b");
        word = word.replace("c", ".c");
        word = word.replace("d", ".d");
        word = word.replace("e", ".e");
        word = word.replace("f", ".f");
        word = word.replace("g", ".g");
        word = word.replace("h", ".h");
        word = word.replace("i", ".i");
        word = word.replace("j", ".j");
        word = word.replace("k", ".k");
        word = word.replace("l", ".l");
        word = word.replace("m", ".m");
        word = word.replace("n", ".n");
        word = word.replace("o", ".o");
        word = word.replace("p", ".p");
        word = word.replace("q", ".q");
        word = word.replace("r", ".r");
        word = word.replace("s", ".s");
        word = word.replace("t", ".t");
        word = word.replace("u", ".u");
        word = word.replace("v", ".v");
        word = word.replace("w", ".w");
        word = word.replace("x", ".x");
        word = word.replace("y", ".y");
        word = word.replace("z", ".z");

        System.out.println(word);
    }
}
