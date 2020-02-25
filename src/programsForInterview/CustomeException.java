package programsForInterview;



public class CustomeException {
	static void validate(int age) throws InvalidAge{
		if(age<18){
			throw new InvalidAge("Invalid age");
		}
		else{
			System.out.println("You can vote..");
		}
		
	}

	public static void main(String[] args) {
		try{
			validate(19);
		}
		catch(Exception e){
			System.out.println("Exception handled : "+e);
			
		}
		finally{
			System.out.println("Hey you,,,");
		}

	}

}
