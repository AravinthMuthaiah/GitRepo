package interviewPrograms;

public class MaximumvalueInArray {

	public static void main(String[] args) {

		int[]a= {10,20,30,40,900,70};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i] <a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
	System.out.println("The Maximum number in the array is "+a[0]);
	System.out.println("The Minimum number in the array is "+a[a.length-1]);
		
	}

}
