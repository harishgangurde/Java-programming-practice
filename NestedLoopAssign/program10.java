import java.util.*;
class Code10{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Number of Rows :");
                int row = sc.nextInt();
                for(int i = 1; i <= row; i++){
			int num = 1;
                	char ch = 64;
                        for(int j = 1; j <= row; j++){
                                System.out.print(num +""+(char)(ch+j)+" ");
                                num++;
                        }
                        System.out.println();
                }
        }
}
