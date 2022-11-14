package interviewPrograms;

public class InsertAnElementInArray {

	public static void main(String[] args) {
//How to insert an element in an array
		int[]a= new int[8];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		a[5]=70;
		a[6]=80;
		a[7]=90;
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
