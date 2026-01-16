import java.util.*;
class Code10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int N=sc.nextInt();
		int count=0;
		for(int i=1;i<=N;i++){
			if(i%2==1){
				count++;
			}
		}
		System.out.println("Count of odd num : "+count);
	}
}
