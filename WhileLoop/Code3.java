import java.util.*;
class Code3{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Range from :");
                int from=sc.nextInt();
		System.out.println("Enter Range to :");
		int to=sc.nextInt();
		int i=from;
		while(i<=to){
			if(i%4==0 || i%7==0){
				System.out.println(i);
			}
			i++;
		}
	}
}
