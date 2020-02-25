package programsForInterview;

public class StringCompare {

	public static void main(String[] args) {

		String s1="india";
		String s2="india";
		String s3=new String("india");
		System.out.println(s1.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s1==s3);
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s2));
		
	}

}
