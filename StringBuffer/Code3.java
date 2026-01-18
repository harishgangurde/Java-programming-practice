
class Code3{
	public static void main(String[] args){

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1);
		System.out.println(sb1.capacity());

		sb1.append("Core2Web");
		System.out.println(sb1);
		System.out.println(sb1.capacity());

		sb1.append("Incubators");
		System.out.println(sb1);
		System.out.println(sb1.capacity());

		sb1.append("Core2Web");
		System.out.println(sb1);
		System.out.println(sb1.capacity());

		sb1.append("Core2Web");
		System.out.println(sb1);
		System.out.println(sb1.capacity());

		sb1.append("S");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
	}
}
