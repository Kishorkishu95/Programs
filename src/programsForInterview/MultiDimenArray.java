package programsForInterview;

public class MultiDimenArray {

	public static void main(String[] args) {

		int a[][] ={
				{1, 5, 3},
				{3, 9, 6},
				{7, 1, 9}
				};
		int b[][]={
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
				};
		int c[][]=new int[3][3];
		System.out.println("Printing the elements of an array..");
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length; j++){
				c[i][j]=b[i][j]+a[i][j];
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
