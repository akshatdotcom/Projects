import java.util.Scanner;

public class Prob59A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int lowercase = 0;
        int uppercase = 0;

        String temp = sc.next();

        for(int i = 0; i < temp.length(); i++) {
            if(Character.isUpperCase(temp.charAt(i))) uppercase++;
            else lowercase++;
        }

        if(uppercase > lowercase) temp = temp.toUpperCase();
        else temp = temp.toLowerCase();

        System.out.println(temp);
    }
}
