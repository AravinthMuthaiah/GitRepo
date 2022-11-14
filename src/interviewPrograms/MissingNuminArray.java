package interviewPrograms;

public class MissingNuminArray {

	public static void main(String[] args) {

		int[]a= {1,2,3,5,6};
		int sum=0;

		//Sum of the given Array
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of the given Array "+sum);
		
		int sum1=0;
		for(int i=1;i<=6;i++) {
			sum1=sum1+i;
		}
		System.out.println("Sum of the elements given Array "+sum1);
		
		//Missing number is
		int missingN=sum1-sum;
		System.out.println("The Missing Number is "+missingN);
	}

}
