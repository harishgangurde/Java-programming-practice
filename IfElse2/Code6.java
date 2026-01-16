import java.util.*;
class Code6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age :");
		int age=sc.nextInt();
		if(age<=18){
			System.out.println("Valid age for voting");
		}else{
			System.out.println("Invalid age");
		}
	}
}
