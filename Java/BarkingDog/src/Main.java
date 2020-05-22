public class Main {

    public static void main(String[] args) {
        boolean testing = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(testing);

        testing = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(testing);

        testing = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(testing);

        testing = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(testing);

    }

}
