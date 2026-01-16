import java.util.*;
class Code2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Grade :");
		char x=sc.next().charAt(0);
		switch(x){
			case 'O' :
				System.out.println("Outstanding");
				break; 
			case 'A' :
				System.out.println("Excellent");
				break;
			case 'B' :
				System.out.println("Very Good");
				break;
			case 'C' :
				System.out.println("Good");
				break;
			case 'P' :
				System.out.println("Pass");
				break;
			default :
				System.out.println("Fail");
		}
	}
}
