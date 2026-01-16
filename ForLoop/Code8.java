import java.util.*;
class Code8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int N=sc.nextInt();
		for(int i=10;i>=1;i--){
			System.out.println(N+"x"+i+"="+N*i);
		}
	}
}
