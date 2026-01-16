class Code9{
	public static void main(String[] args){
		int x=0;
		int result1= ++x + ++x + ++x + ++x;
		System.out.println(result1);

		int result2= x++ + x++ + x++ + x++;
		System.out.println(result2);

	}
}
