import java.util.*;
class Code7{
        public static void main(String[] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Number");
                int num=sc.nextInt();
                if(num%2==0 && num%5==0 && num%10==0){
                        System.out.println(num+ " is divisible by 2,5 or 7 ");
                }else{ System.out.println(num+ " is not divisible by 2,3 or 10" );
                }
        }
}                                            
