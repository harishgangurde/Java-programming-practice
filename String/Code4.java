
class StringDemo4{
	public static void main(String[] args){

		String str1 = "Core2Web";
		String str2 = new String("Core2Web");
		String str3 = "Core2Web";
		String str4 = new String("Core2Web");

		System.out.println(str1==str3);
		System.out.println(str2==str4);
	}
}
