import java.util.*;
class Code1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		if(num<=1000){
			System.out.println(num+" Is in Range of 1 to 1000");
		}else{
			System.out.println(num+" Is not in Range of 1 to 1000");
		}
	}
}
