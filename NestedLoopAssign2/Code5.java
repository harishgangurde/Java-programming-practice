import java.util.*;

class Code5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        char ch = (char) ('A' + rows - 1); 

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            ch--; 
        }
    }
}

