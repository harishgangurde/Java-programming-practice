import java.util.*;

class Code7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        for (int i = rows; i >= 1; i--) { 
            for (int j = 1; j <= rows; j++) {
                System.out.print((i + (j - 1) * rows) + " ");
            }
            System.out.println();
        }
    }
}

