import java.util.*;
class Code4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		char ch = 'a';
		if (ch>='a' && ch<='z'){
			System.out.println(ch+ " is lower case ");
		}else if (ch>=65 && ch<=90){
			System.out.println(ch+ " is Upper case ");
		}else{
			System.out.println(ch+ " is not Alphabet ");
		}
	}
}
