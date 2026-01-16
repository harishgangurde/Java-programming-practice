import java.util.*;
class Code4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int N=sc.nextInt();
		for(int i=1;i<=N;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
}
