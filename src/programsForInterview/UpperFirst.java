package programsForInterview;

public class UpperFirst {

	public static void main(String[] args) {

		String str = "I Love My KarnaTaka";
		System.out.println(convertTo(str));
	}
	private static String convertTo(String str) {
		char ch[] = str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			if((i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
			|| (ch[i] =='a' || ch[i] =='e' || ch[i] =='i' || ch[i] =='o' || ch[i] =='u'))
			{
				if(ch[i]>='a' && ch[i]<='z') {
					
						ch[i]=(char) (ch[i]-'a' + 'A');
					}
			}
			 else if (ch[i] >= 'A' && ch[i] <= 'Z')
                ch[i] = (char)(ch[i] + 'a' - 'A');  
	            }
		
		String st = new String(ch);
		return st;
	}

}
