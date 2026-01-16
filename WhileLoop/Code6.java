import java.util.*;
class Code6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character from :");
		char ch1=sc.next().charAt(0);

		System.out.println("Enter Character to :");
		char ch2=sc.next().charAt(0);

		while(ch1<=ch2){
			if(ch1!='A' && ch1!='E' && ch1!='I' && ch1!='O' && ch1!='U' && ch1!='a' && ch1!='e' && ch1!='i' && ch1!='o' && ch1!='u'){
				System.out.println(ch1);
			}
			ch1++;
		}
	}
}

