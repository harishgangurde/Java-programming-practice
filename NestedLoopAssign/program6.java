import java.util.*;
class Code6{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Number of Rows :");
                int row = sc.nextInt();
		int num = 0;
                for(int i = 1; i <= row; i++){
			 num = row;
                        for(int j = 1; j <= row; j++){
                                System.out.print(num+" ");
				num--;
                        }
                        System.out.println();
                }
        }
}
