import java.io.*;
class Employee{
	public static void main(String[] args) throws IOException{
		InputStreamReader irs = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(irs);


		System.out.println("Enter Company Name :");
		String compName=br.readLine();


		System.out.println("Enter Company Location :");
		String compLoc=br.readLine();


		System.out.println("Enter Employee Count :");
		int empCount=Integer.parseInt(br.readLine());


		System.out.println("Enter Employee Salary :");
		float empSal=Float.parseFloat(br.readLine());

		
		System.out.println("Company Name : "+compName);
		System.out.println("Company Location : "+compLoc);
		System.out.println("Employee Count : "+empCount);
		System.out.println("Employee Salary : "+empSal);
	}
}
