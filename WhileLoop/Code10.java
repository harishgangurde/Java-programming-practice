import java.util.*;
class Code10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range from: ");
        int from = sc.nextInt();
        System.out.println("Enter Range to: ");
        int to = sc.nextInt();

        if (from < to) {
            System.out.println("Invalid range");
        }
        while (from >= to) {
            if (from % 4 == 0 && from % 5 == 0) {
                System.out.println(from);
            }
            from--;
        }
    }
}

