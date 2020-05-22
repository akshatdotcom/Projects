import java.util.Scanner;

public class Prob208A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String temp = sc.next();
        temp = temp.replace("WUBWUB", " ");
        temp = temp.replace("WUB", " ").trim();
        temp = temp.trim();
        System.out.println(temp);
    }
}
