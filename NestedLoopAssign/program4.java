import java.util.*;
class Code4{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Number of Rows :");
                int N = sc.nextInt();
		int num = 1;
                for(int i = 1; i <= N; i++){
                        for(int j = 1; j <= N; j++){
                                System.out.print(num+" ");
				num++;
                        }
                        System.out.println();
                }
        }
}
