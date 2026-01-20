import java.io.*;
class Buffer4{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Num1 :");
		int num1=Integer.parseInt(br.readLine());

		System.out.print("Enter Num2 :");
		int num2=Integer.parseInt(br.readLine());

		System.out.println("Addition of "+num1+" and "+num2+" is "+num1+num2);
	}
}
