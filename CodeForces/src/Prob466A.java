import java.util.Scanner;

// INCOMPLETE

public class Prob466A {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int subwayUse = sc.nextInt();
        int specialTicketRides = sc.nextInt();
        int oneRideCost = sc.nextInt();
        int specialTicketCost = sc.nextInt();

        double specialTicketOneRideCost = specialTicketCost / specialTicketRides;
        boolean useSpecialTicket = false;

        if((subwayUse >= specialTicketRides && specialTicketOneRideCost <= oneRideCost) || specialTicketCost < oneRideCost) useSpecialTicket = true;

        double money = 0;
        int answer1;
        int answer2;

        if(specialTicketRides > subwayUse && specialTicketOneRideCost < oneRideCost) {
            answer1 = specialTicketCost;
            subwayUse = 0;
            answer2 = subwayUse * oneRideCost;
            money = Math.min(answer1, answer2);
        }

        if(useSpecialTicket) {
            money += (subwayUse / specialTicketRides) * specialTicketCost;
            subwayUse %= specialTicketRides;

            if(specialTicketCost <= oneRideCost) {
                if(subwayUse > 0) {
                    money += specialTicketCost;
                    subwayUse = 0;
                }
            }
        }

        money += subwayUse * oneRideCost;
        subwayUse %= 1;

        System.out.println((int) money);
    }
}
