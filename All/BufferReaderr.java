import java.io.*;
class Bufferr{
	public static void main(String[] args) throws IOException{
		InputStreamReader irs=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(irs);


		System.out.println("Enter Num1 :");
		int num1=Integer.parseInt(br.readLine());

		
		System.out.println("Enter Num2 :");
		int num2=Integer.parseInt(br.readLine());


		System.out.println(num1+num2);
	}
}

