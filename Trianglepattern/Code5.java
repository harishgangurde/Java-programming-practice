import java.util.*;

class triangle5 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the number of rows : ");
                int rows = sc.nextInt();

                for(int i = 1; i <= rows; i++) {

                        int num = rows;

                        for(int j = 1; j <= i; j++) {

                                System.out.print(num + "\t");
                                num += rows;
                        }
                        System.out.println();
                }
        }
}

