import java.util.*;
class Code5{
	public static void main(String[] aths){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows :");
		int row = sc.nextInt();

		for(int i = 1; i<=row; i++){
			for(int j = 1; j<=row; j++){
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}
}
