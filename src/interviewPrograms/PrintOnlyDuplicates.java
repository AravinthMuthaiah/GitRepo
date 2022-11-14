package interviewPrograms;

public class PrintOnlyDuplicates {

	public static void main(String[] args) {

		int[]a= {10,20,50,60,70,20,10};
		for(int i=0;i<a.length;i++) {//10
			for(int j=i+1;j<a.length;j++) {//20,50,60,70,20,10
				if(a[i]==a[j]) {
					System.out.println(a[i]);//20,10
				}
			}
		}
		
	}

}
