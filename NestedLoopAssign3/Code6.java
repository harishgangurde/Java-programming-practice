import java.util.*;

class Nested26 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the number of rows : ");
                int rows = sc.nextInt();

                for (int i = 1; i <= rows; i++) {

                        if (i % 2 == 1) {

                                for (int j = rows; j >= 1; j--) {

                                        System.out.print((char) (64 + j) + "\t");

                                                }

                                         } else {

                                                for (int j = 1; j <= rows; j++) {

                                                        System.out.print((char) (64 + j) + "\t");

                                                }

                                        }

                                        System.out.println();

                                }
	}
}

