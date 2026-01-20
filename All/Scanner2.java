import java.util.*;

class Utilscan{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Name : ");
		String empName = sc.next();

		System.out.println("Enter Employee ID : ");
		int empID = sc.nextInt();

		System.out.println("Enter Employee Salary : ");
		float empSal = sc.nextFloat();

		System.out.println("Employee Name : "+empName);
		System.out.println("Employee ID : "+empID);
		System.out.println("Employee Salary : "+empSal);
	}
}
