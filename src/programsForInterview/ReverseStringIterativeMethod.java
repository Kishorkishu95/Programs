package programsForInterview;

public class ReverseStringIterativeMethod {

	public static void main(String[] args) {

		String str="anusha";
		char[] str2=str.toCharArray();//Converting the string to characters
		int l=str2.length;
		for(int i=l-1;i>=0;i--){
			System.out.print(str2[i]);
		}
	}
}
