import java.util.*;
class Code8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Pointer :");
		float ptr=sc.nextFloat();
		if(ptr>10.0){
			System.out.println("Passed : first class with distinction");
		}else if(ptr<=9.0 || ptr>=8.0){
			System.out.println("Passed : first class");
		}else if(ptr<8.0 || ptr>=7.0){
			System.out.println("Passed : Second class");
		}else if(ptr<7.0 || ptr>=5.5){
			System.out.println("Passed");
		}else{
			System.out.println("Fail");
		}
	}
}
