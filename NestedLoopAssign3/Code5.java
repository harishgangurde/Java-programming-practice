import java.util.*;

class Nested25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        int num = 64 + rows;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows; j++) {
                if (i % 2 == 1) {
                    System.out.print((char) num + "\t");
                } else {
                    System.out.print((num - 64) + "\t");
                }
            }
            num--;
            System.out.println();
        }
    }
}
