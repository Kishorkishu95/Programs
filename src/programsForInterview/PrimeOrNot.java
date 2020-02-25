package programsForInterview;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		int temp, num;
		boolean isPrime=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check : ");
		num=sc.nextInt();
		sc.close();
		for(int i=2; i<=num/2; i++){
			temp=num%i;
			if(temp==0){
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println(num +" is Prime.");
		else
		System.out.println(num +" is not Prime");
	}
}
