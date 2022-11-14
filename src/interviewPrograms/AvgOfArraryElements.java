package interviewPrograms;

public class AvgOfArraryElements {

	public static void main(String[] args) {

		int[]a= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		int Avg=(sum/a.length);
		System.out.println("The Average of the given numbers "+Avg);
	}

}
