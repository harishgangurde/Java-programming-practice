import java.util.*;
class Code10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows :");

		int row = sc.nextInt();
		int num = row;
		int ch = 64 + row;

		for(int i = 1; i <= row; i++){

			for(int j = 1; j <= row; j++){
				System.out.print((char)ch+""+ num + " ");
			}
			num--;
			System.out.println();
		}
	}
}
