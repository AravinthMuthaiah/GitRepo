package interviewPrograms;

public class SumOfTwoMatrices {

	public static void main(String[] args) {

		//How to print the addition of two matrices
		
		int[][]m1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][]m2= {{4,5,6},{2,7,9},{5,7,3}};
		int[][]sum=new int [3][3];
		
		System.out.println("M1 matrix elements");
		
		//Elements of m1
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("M2 matrix elements");
		
		//Elements of m2
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(m2[i][j]+" ");
			}
			System.out.println();
		}
		//Sum of Two Matrices
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum[i][j]=m1[i][j]+m2[i][j];
			}
			
		}
		System.out.println("Sum of matrix elements");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}

}
