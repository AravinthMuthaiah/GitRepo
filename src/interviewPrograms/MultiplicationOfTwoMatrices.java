package interviewPrograms;

public class MultiplicationOfTwoMatrices {

	public static void main(String[] args) {

		//How to print the multiplication of two matrices
		
		int[][]m1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][]m2= {{5,8,7},{1,8,9},{6,5,1}};
		int[][]multi=new int[3][3];
		System.out.println("Elements of M1");
		//Elements of m1
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Elements of M2");
		//Elements of m2
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(m2[i][j]+" ");
			}
			System.out.println();
		}
		
		//Multiplication of m1 and m2
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				multi[i][j]=0;
				for(int k=0;k<3;k++) {
					multi[i][j]=multi[i][j]+m1[i][k]*m2[k][j];			
				}
				
			}
			
			
		}
		System.out.println("Multiplication value of M1 and M2");
		//Multiplication of m1 and m2
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(multi[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
