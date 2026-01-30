
import java.util.*;
class Tokendemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empName, compName, Salary, Location :");
		String info = sc.nextLine();

		System.out.println(info);
		
		StringTokenizer st = new StringTokenizer(info," ");

		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
