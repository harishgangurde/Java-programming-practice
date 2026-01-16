import java.util.*;
class Code5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Float Value : ");
		float x=sc.nextFloat();
		if(x%6==0){
			System.out.println(x+" is divisible by 6");
		}else{
			System.out.println(x+" is not divisible by 6");
		}
	}
}
