import java.util.*;
class Code1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int N=sc.nextInt();
		int i=100;
		int count =0;
		while(count<N){
			System.out.print(i);
			i++;
			count++;
		}
	}
}
