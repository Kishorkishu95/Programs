package programsForInterview;

public class AllStringMethods {

	public static void main(String[] args) {


		String s = "kishor"; // Or String s = new String("kishor");
		System.out.println("The length of kishor is " +s.length());
		System.out.println("The Character at 3rd position is " +s.charAt(3));
		System.out.println("substring from 3rd position is " +s.substring(3));
		System.out.println("substring from 3rd and 6th position is " +s.substring(3, 5));
		
		String s1 = "kannada";
		String s2 = "nadu";
		System.out.println("The concatenated String is " +s1.concat(s2));
		
		String s3 = " kannada nadu";
		System.out.println("Index of the first occurence of nadu is " +s3.indexOf("nadu"));
		System.out.println("Index of the first occurence of the specified string is " +s3.indexOf('a', 5));
		Boolean out = "kishor".equals("kishor");
		System.out.println("is kishor equal to kishor : " +out);
		Boolean out1 = "kishor".equalsIgnoreCase("Kishor");
		System.out.println("is kishor equal to kishor : " +out1);
		int output = s1.compareTo(s2);
		System.out.println("Compare method : " +output);
		System.out.println("Changing to lower case : " +s1.toUpperCase());
		System.out.println("Trim white spaces : "+s3.trim());
		System.out.println("Replacing the characters "+s.replace('k', 'a'));
		

		
		
	}

}
