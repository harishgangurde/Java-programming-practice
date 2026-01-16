import java.util.*;
class Code8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1=sc.nextInt();
		System.out.println("Enter num2:");
		int num2=sc.nextInt();
		if(num1>0 && num2>0){
			System.out.println("Multiplication of num1 and num2 is : "+num1*num2);
		}else{
			System.out.println("Sorry Negative number is not allowed");
		}
			int x=(num1*num2)%2=0;
		switch(x){
			case 1 :
				System.out.println((x)+" is Even");
			default :
				System.out.println((x)+" is Odd");
			
		}
	}
}

