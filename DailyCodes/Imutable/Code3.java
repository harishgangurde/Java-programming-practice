

class Code3{
	public static void main(String[] args){
		String str1 = new String("Sashi");
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

		str1 = str1+"Bagal";
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
	}
}
