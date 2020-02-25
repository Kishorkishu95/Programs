package programsForInterview;

public class Palindrome {

	public static void main(String[] args) {

		String original = "palindrome"; 
		String reverse="";
		for(int i=original.length()-1; i>=0; i--){
			reverse= reverse + original.charAt(i);
		}
		System.out.println("Reverse is : "+reverse);
		
		if(original.equals(reverse))
			System.out.println("String is Palindrome.");
		else
			System.out.println("Not a Palindrome.");
		}
	}
