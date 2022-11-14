package interviewPrograms;

public class SumOfDiagonalElement {

	public static void main(String[] args) {

		//How to print the sum of diagonal elements of a matrix
		int[][]m1= {{1,2,3},{4,5,6},{7,8,10}};
		int sum=0;
		//Elements of m1
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
		
		//Sum of Diaogonal Elements
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j) {
					sum=sum+m1[i][j];	
				}
				
			}
		}
		System.out.println("The Sum of Diaogonal Elements is "+sum);
	}

}
