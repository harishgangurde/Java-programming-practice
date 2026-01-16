import java.util.*;

class Nested29 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the number of rows : ");
                int rows = sc.nextInt();

                int ch = 0;

                int num = 0;

                for(int i = 1; i <= rows; i++) {

                        if(i %2 == 1) {

                                ch = 64 + rows;
                        } else {

                                num = 1;
                        }

                        for(int j = 1; j <= rows; j++) {

                                if(i %2 == 1) {

                                        System.out.print((char) ch + " ");
                                        ch--;
                                } else {

                                        System.out.print(num + " ");
                                        num++;
                                }
                        }
                        System.out.println();
		}
	}
}
