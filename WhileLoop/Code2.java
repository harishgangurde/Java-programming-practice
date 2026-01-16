import java.util.*;
class Code2{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter from :");
                int from=sc.nextInt();
		System.out.println("Enter to :");
		int to=sc.nextInt();
		int i=from;
		while(i<=to){
			if(i%5==0){
				System.out.println(i);
			}
				i++;
		}
	}
}
