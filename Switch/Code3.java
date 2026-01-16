import java.util.*;
class Code3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Shortform :");
		String x=sc.next();
		switch(x){
			case "S" :
				System.out.println("Small");
				break;
			case "L" :
				System.out.println("Large");
				break;
			case "XL" :
				System.out.println("Extra Large");
				break;
			case "XXL" :
				System.out.println("Extra Extra Large");
				break;
			default :
				System.out.println("invalid Size");
		}
	}
}
