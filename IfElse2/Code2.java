import java.util.*;
class Code2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		if(num%13==0){
			System.out.println(num+" Is in the table of 13");
		}else{
			System.out.println(num+" Is not in the table of 13");
		}
	}
}
