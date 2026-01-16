import java.util.*;
class Code4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int N=sc.nextInt();
		int i=N;
		while(i>=1){
			if(N<1 || N>50){
				System.out.println("Invalid input! N must be between 1 and 50.");
			}
			System.out.println(i*i);
			i--;
		}
	}
}
