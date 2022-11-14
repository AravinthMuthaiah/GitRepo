package interviewPrograms;

public class ArrangeNumInAscendingOrder {

	public static void main(String[] args) {

		int num=786;
		while(num>0) {
			int rem=num%10;//9
			int n=num/10;//12345678
			int rem1=n%10;//8
			if(rem >rem1) {//9<8
				int temp=rem;
				rem=rem1;
				rem1=temp;
			}
			
			num=num/10;//12345678
			System.out.print(rem);
				
			//System.out.print(rem1);
		}
		
	}

}
