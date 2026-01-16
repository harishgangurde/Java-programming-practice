import java.util.*;

class Code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Rows: ");
        int row = sc.nextInt();

        char ch = (char) ('a' + row - 1);

        for (int i = 1; i <= row; i++) {
            char ch2 = ch;
            for (int j = 1; j <= row; j++) {
                System.out.print(ch2 + " ");
                ch2--;
            }
            System.out.println();
        }
    }
}

