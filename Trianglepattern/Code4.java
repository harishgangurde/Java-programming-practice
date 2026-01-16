import java.util.*;

class triangle4 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the number of rows : ");
                int rows = sc.nextInt();

                int num = 65;

                for(int i = 1; i <= rows; i++) {

                        for(int j = 1; j <= i; j++) {

                                System.out.print((char)num + "\t");
                                num++;
                        }
                        System.out.println();
                }
        }
}
