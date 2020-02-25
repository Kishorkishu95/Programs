package programsForInterview;

public class MultiCatchBlocks {

	public static void main(String[] args) {

		try{
			int a[]=new int[5];
			a[10]=10;

		}

		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of range occured..");}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception occured..");}
		catch(Exception e){
			System.out.println(e);}
		
		
	
		finally{
			System.out.println("Finally done with this..s");
		}
		
		System.out.println("I am getting engaged..");

	   }

}
