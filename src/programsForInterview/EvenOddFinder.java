package programsForInterview;

import java.util.Scanner;

public class EvenOddFinder {

	public static void main(String[] args) {

		System.out.println("Enter the number to check : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n % 2==0){
			System.out.println("Entered number is Even number : "+n);
		     }
		else{
			System.out.println("Entered number is an Odd number : "+n);
		    }
	}

}
