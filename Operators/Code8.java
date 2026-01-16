class Code8{
	public static void main(String[] args){
		int x=14;
		int y=22;
		int result1= ++x + y++;
		int result2= x++ + ++y + ++x + ++x;
		int result3= y++ + ++x + ++x;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}

