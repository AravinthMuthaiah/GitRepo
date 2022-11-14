package interviewPrograms;

public class CountEvenAndOddDigitInaNumber {

	public static void main(String[] args) {

		//Counting Number of Even Digit and Odd Digits in a number
		int num=789456123, evenCount=0, oddCount=0;
		while(num>0) {
			int rem=num%10;
			
			if(rem%2==0) {
				System.out.println("Even NUmber "+rem);
				evenCount++;
			}else {
				System.out.println("Odd NUmber "+rem);
				oddCount++;
			}
			
			num=num/10;
		}
		
		System.out.println("Even Count is "+evenCount);
		System.out.println("Odd Count is "+oddCount);
	}

}
