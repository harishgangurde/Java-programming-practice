import java.util.*;

class Nested22 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the number of rows : ");
                int rows = sc.nextInt();

                int num = rows * (rows + 1);

                for(int i = 1; i <= rows; i++) {

                        for(int j = 1; j <= rows; j++) {

                                System.out.print(num + "\t");
                                num--;
                        }
                        System.out.println();
                }
        }
}

