import java.util.*;
class Code7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Selling Price :");
		int num1=sc.nextInt();
		System.out.println("Enter Cost Price :");
		int num2=sc.nextInt();
		if(num1<0 || num2<0){
			System.out.println("Negative Value is not allowed"); 
		}else if(num1>num2){
			System.out.println("Profit of "+(num1-num2));
		}else if(num1<num2){
			System.out.println("Loss of "+(num2-num1));
		}else{
			System.out.println("No Profit no Loss");
		}
	}
}	
