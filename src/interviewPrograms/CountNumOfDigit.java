package interviewPrograms;

public class CountNumOfDigit {

	public static void main(String[] args) {

		int num=123456, count=0;
		while(num>0) {
			int rem=num%10;
			count++;
			num=num/10;
		}
		System.out.println("Number of Digits is "+count);
	}

}
