import java.util.*;
class Code3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Alphabet :");
		char x ='i';
		if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' ||
		   x=='A' || x=='E' || x=='O' || x=='O' || x=='U'){
			System.out.println(x+" is Vowel");
		   }else if((x>='a') && (x<='z') || (x>='A') && (x<='Z')){
			  System.out.println(x+" is Consonant");
		   }else{
			   System.out.println("Invalid");
		   }
	}
}	
