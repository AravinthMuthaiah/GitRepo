package interviewPrograms;

public class PrintEvenandOddElementsInArray {

	public static void main(String[] args) {

		//Print Even and Odd Number in an Array
		int[]a= {10,11,12,13,14,15,16};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+" is an Even Number");
			}else {
				System.out.println(a[i]+" is an Odd Number");
			}
		}
	}

}
