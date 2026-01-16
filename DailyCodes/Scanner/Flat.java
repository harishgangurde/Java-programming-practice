import java.util.*;
class Flat{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Society Name :");
		String Society=sc.next();

		System.out.println("Enter Wing :");
		char Wing=sc.next().charAt(0);

		System.out.println("Enter FlatNo. :");
		int FlatNo=sc.nextInt();

		System.out.println("Enter Rent :");
		float Rent=sc.nextFloat();

		System.out.println("Society Name : "+Society);
		System.out.println("Wing : "+Wing);
		System.out.println("Flat Number : "+FlatNo);
		System.out.println("Rent : "+Rent);
	}
}

