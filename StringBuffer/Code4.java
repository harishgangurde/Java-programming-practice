
class StringMethod{
	public static void main(String[] args){

		String str = new String("Rohan");

		System.out.println(str.concat("Pawar"));

		System.out.println(str.length());

		System.out.println(str.charAt(1));

		System.out.println(str.compareTo("Rohan"));

		System.out.println(str.compareToIgnoreCase("Rohan"));

		System.out.println(str.replace('R','J'));

		System.out.println(str.indexOf('o'));

		System.out.println(str.lastIndexOf('o'));

		System.out.println(str.substring(1,3));

		System.out.println(str.toLowerCase());

		System.out.println(str.toUpperCase());

		System.out.println(str.trim());
	}
}
