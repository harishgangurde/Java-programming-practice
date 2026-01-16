import java.util.*;
class Code4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your percentage :");
		double percentage=sc.nextDouble();
		if(percentage>90.00){
			System.out.println("Medical");
		}else if(percentage<=90.00 && percentage>60.00){
			System.out.println("Engineering");
		}else if(percentage<=60.00 && percentage>50){
			System.out.println("BCS");
		}
	}
}
