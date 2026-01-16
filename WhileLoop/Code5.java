import java.util.*;
class Code5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter days :");
		int N=sc.nextInt();

		int i=N;
		while(i>=0){
			if(N<0){
				System.out.println("Invalid Input");
			}
			System.out.println(i+" days remaining");
			i--;
		}
	}
}
