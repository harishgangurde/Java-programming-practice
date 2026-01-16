import java.util.*;
class Code4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num1 :");
		int num1=sc.nextInt();
		System.out.println("Enter Num2 :");
		int num2=sc.nextInt();
		System.out.println("Which Operation");
		char x=sc.next().charAt(0);
		switch(x){
			case '+' :
				System.out.println(num1+num2);
				break;

			case '-' :
				System.out.println(num1-num2);
				break;

			case '*' :
				System.out.println(num1*num2);
				break;

			case '/' :
				System.out.println(num1/num2);
				break;

			case '%' :
				System.out.println(num1%num2);
				break;
		}
	}
}

