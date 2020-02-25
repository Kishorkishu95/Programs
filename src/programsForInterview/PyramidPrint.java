package programsForInterview;

import java.util.Scanner;

public class PyramidPrint {

	public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of rows you want : ");
		int rowNums=sc.nextInt();
		int rowCount=1;
		for(int i=rowNums;i>0;i--){
			for(int j=1;j<=i;i++){
				System.out.print(" ");
			}
			for(int j=1;j<=rowCount;j++){
				System.out.print("* ");
			}
			System.out.println();
			rowCount++;
		}
	}

}
