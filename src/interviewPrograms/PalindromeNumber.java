package interviewPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num=123321, a=0, temp=num;
		while(num>0) {
			int rem=num%10;
			a=a*10+rem;
			//a=0*10+1=1
			//a=1*10+2=12
			//a=12*10+3=123
			//a=123*10+3=1233
			//a=1233*10+2=12332
			//a=12332*10+1=123320+2=123321
			
			num=num/10;
		}
		num=temp;
		if(a==num) {
			System.out.println("Number is Palindrome number");
		}else {
			System.out.println("Number is not a Palindrome number");
		}
	}

}
