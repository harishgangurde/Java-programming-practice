class Code7{
	public static void main(String[] args){
		int x=19;
		int result1= x++ + x++;
		System.out.println(result1);

		int result2= ++x + x++ + ++x;
		System.out.println(result2);
	}
}

