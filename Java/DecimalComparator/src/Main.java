public class Main {


    public static void main(String[] args) {
        boolean result = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(result);

        result = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(result);

        result = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(result);

        result = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(result);

        result = DecimalComparator.areEqualByThreeDecimalPlaces(3.174, 3.175);
        System.out.println(result);

        double z = (int) (3.58888);
        System.out.println(z);

//        the following code did not work for some reason - i haven't figured out why but it especially did not work with the last test (3.174, 3.175)
//        i'm going to use a different way to do the same thing but i'm curious why this didn't work
//        public class DecimalComparator {
//
//            public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
//
//                if (((x - y) > -.001) && ((x - y) < .001)) {
//                    return true;
//                }
//
//                return false;
//            }
//        }


    }
}
