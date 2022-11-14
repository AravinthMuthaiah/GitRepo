package interviewPrograms;

public class SwappingTwoNUmber {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		System.out.println("Before swapping a is "+a);
		System.out.println("Before swapping b is "+b);
		a=a+b; //a=30
		b=a-b; //b=30-20=10
		a=a-b; //a=30-10=20
		
		System.out.println("After swapping a is "+a);
		System.out.println("After swapping b is "+b);
		
		
	}

}
