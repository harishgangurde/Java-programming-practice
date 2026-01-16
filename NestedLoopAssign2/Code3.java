import java.util.*;

class Code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            int num = i;  
            for (int j = 1; j <= rows; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

