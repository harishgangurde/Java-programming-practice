import java.io.*;
class Buffer3{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Society Name :");
		String socName = br.readLine();

		System.out.println("Enter Wing :");
		char wing = (char)br.read();
		br.skip(1);

		System.out.println("Enter Flat No. :");
		int flatNo = Integer.parseInt (br.readLine());

		System.out.println("Enter Flat rent :");
		float rent = Float.parseFloat(br.readLine());

		System.out.println("Society Name :"+socName);
		System.out.println("Wing :"+wing);
		System.out.println("Flat Number :"+flatNo);
		System.out.println("Flat Rent :"+rent);
	}
}
