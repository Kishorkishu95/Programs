package programsForInterview;

public class ReverseStringRecursiveMethod {
	private static String reverseMethod(String str) {
		if((str==null)||(str.length()<=1)){
			return str;
		}
		return reverseMethod(str.substring(1)) + str.charAt(0);
	}
	public static void main(String[] args) {

		String str="javascript";//str=javascript
		System.out.println(reverseMethod(str));
	}

}
