package interviewPrograms;

public class SubtractionOfTwoMatrices {

	public static void main(String[] args) {

		int[][]m1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][]m2= {{7,8,9},{2,3,5},{4,2,1}};
		int[][]diff=new int[3][3];
		
		System.out.println("ELements of M1");
		//Elements of m1
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("ELements of M2");
		//Elements of m2
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(m2[i][j]+" ");
				}
			System.out.println();
		}
		//Diff of m1 and m2
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				diff[i][j]=m1[i][j]-m2[i][j];
			}
			
		}
		System.out.println("Subtraction of M1 and M2");
		//Difference between two matrices
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(diff[i][j]+" ");
			}
			System.out.println();
		}
				
		
	}

}
