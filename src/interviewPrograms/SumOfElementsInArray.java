package interviewPrograms;

public class SumOfElementsInArray {

	public static void main(String[] args) {

		//Sum of Elements in the Array
		int[]a= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of elements in an array "+sum);
	}

}
