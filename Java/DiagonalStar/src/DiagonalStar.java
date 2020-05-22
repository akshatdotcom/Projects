public class DiagonalStar {
    public static void printSquareStar(int number) {
        if(number > 4) {
            String star = "*";
            String space = " ";
            for(int row = 1; row <= number; row++) {
                if(row != 1) System.out.println();
                for(int column = 1; column <= number; column++) {
                    if(row == 1 || row == number) System.out.print(star);
                    else if(column == 1 || column == number) System.out.print(star);
                    else if(row == column) System.out.print(star);
                    else if(column == number - row + 1) System.out.print(star);
                    else System.out.print(space);
                }
            }
        } else System.out.println("Invalid Value");
    }
}