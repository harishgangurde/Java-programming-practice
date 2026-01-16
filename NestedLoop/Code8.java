import java.util.*;
class Code8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Rows :");
		int rows = sc.nextInt();
		int num = 0;
		for(int i = 1; i<=rows; i++){
			num = rows;
			for(int j = 1; j<=rows; j++){
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
	}
}
