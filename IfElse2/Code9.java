import java.util.*;
class Code9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Side :");
		int a=sc.nextInt();
		System.out.println("Enter Second Side :");
		int b=sc.nextInt();
		System.out.println("Enter Third Side :");
		int c=sc.nextInt();
		if(((a*a)+(b*b)==(c*c)) || ((b*b)+(c*c)==(a*a)) || ((c*c)+(a*a)==(b*b))){
			System.out.println("It is pythagorean triplet");
		}else{
			System.out.println("It is not pythagorean triplet");
		}
	}
}
