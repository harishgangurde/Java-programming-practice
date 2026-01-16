import java.util.*;
class Code7{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Subscription : ");
                String x=sc.next();
                 switch(x){
                        case "Platinum" :
                                System.out.println("For Platinum plan price is 799");
                                break;

                        case "Gold" :
                                System.out.println("For Gold plan price is 599");
                                break;

                        case "Silver" :
                                System.out.println("For Silver plan price is 399");
                                break;

                        case "Bronze" :
                                System.out.println("For Bronze plan price is 199");
                                break;
                        default :
                                System.out.println("For less tham 199,the platform is free with limited access");
                 }
        }
}
