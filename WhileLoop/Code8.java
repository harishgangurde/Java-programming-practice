import java.util.*;
class Code8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range from :");
		int from=sc.nextInt();

		System.out.println("Enter Range to :");
		int to=sc.nextInt();
		int sum=0;
		int i=from;
		 while (i <= to) {
            if (from > to) {
                System.out.println("Invalid range");
            }else{
                sum += i;
                i++;
            }
        }

        if (from <= to) {
            System.out.println("Sum of numbers from " + from + " to " + to + " is: " + sum);
        }
    }
}
