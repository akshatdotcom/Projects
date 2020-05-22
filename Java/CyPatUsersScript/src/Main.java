import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String usersInput[] = getUsers();
        for(int i = 0; i < usersInput.length; i++) {
            System.out.println(usersInput[i]);
        }
    }

    public static String[] getUsers() {
        int i = 0;
        String users[] = new String[0];
        System.out.print("Enter how many users there are: ");
        int x = scanner.nextInt();
//        System.out.print("Enter the " + x + " users: ");
        users = new String[x];

        while((scanner.next() != "exit") || (i <= x)) {

            System.out.println("Enter user " + i + ": ");
            users[i] = scanner.next();
            i++;
        }

        scanner.close();

        return users;
    }
}
