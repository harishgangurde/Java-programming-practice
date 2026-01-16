import java.util.Scanner;

class Nested24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                int num = (i - 1) * rows + j;

                if (num % 2 == 1) {
                    System.out.print((num * num * num) + "\t");
                } else {
                    System.out.print((num * num) + "\t");
                }
            }
            System.out.println();
        }
    }
}

