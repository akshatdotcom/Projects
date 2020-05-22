import java.util.Scanner;

public class Prob734A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int length = sc.nextInt();
        String temp = sc.next();
        char arr[] = temp.toCharArray();
        int a = 0;
        int d = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 'A') a++;
            else d++;
        }

        if(a == d) System.out.println("Friendship");
        else if(a > d) System.out.println("Anton");
        else System.out.println("Danik");
    }
}
