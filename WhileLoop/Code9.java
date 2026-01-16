import java.util.*;
class Code9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range from: ");
        int from = sc.nextInt();

        System.out.print("Enter Range to: ");
        int to = sc.nextInt();

        int sum = 0;
        while (from <= to){
            if (from % 2 != 0){
                sum += from;
            }
            from++;
        }

        System.out.println("Sum of odd numbers: " + sum);
    }
}

