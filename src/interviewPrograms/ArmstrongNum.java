package interviewPrograms;

public class ArmstrongNum {

	public static void main(String[] args) {

		int num=153, temp=num, count=0, arm=0 ;
		
		//Count how many digits
		while(num>0) {
			int rem=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count);
		num=temp;
		while(num>0) {
			int r=num%10;
			arm=arm+(r*r*r);
			num=num/10;
		}
		num=temp;
		if(arm==num) {
			System.out.println("The number "+num+" is an armstrong number");
		}else {
			System.out.println("The number "+num+" is not an armstrong number");
		}
		
		
	}

}
