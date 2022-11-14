package interviewPrograms;

public class NumisPrimeorNot {

	public static void main(String[] args) {

		int num=13, count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
			count++;
			}
		}
			if(count==2) {
				System.out.println("The given number is prime number");
			}	else {
				System.out.println("The given number not a prime number");
			}
			
		
		
	}

}
