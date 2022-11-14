package interviewPrograms;

public class TransposeOfAMatrix {

	public static void main(String[] args) {
		//How to print the transpose of matrix
		
		int[][]m1= {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][]res=new int[3][3];
		
		System.out.println("Elements of M1");
		
		//Element of m1
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
		
		//Transpose of A Matrix
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				res[i][j]=m1[j][i];
			}
		}
		
		System.out.println("Transpose of Matrix M1");
		//transpose of a matrix
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
