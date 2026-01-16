import java.util.*;
class Code1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Traffic Colour :");
		String x=sc.next();
		switch(x){
			case "Red" :
				System.out.println("Stop");
				break;
			case "Yellow" :
				System.out.println("Watch and go");
				break;
			case "Green" :
				System.out.println("Go");
				break;
			default :
				System.out.println("No such colour present in traffic lights");
		}
	}
}
