package interviewPrograms;

public class FactorialOfNumber {

	public static void main(String[] args) {

		int num=5, fact=1, temp=num;
		while(num>0) {
			fact=fact*num;
			//fact=1*5=5
			//fact=5*4=20
			//fact=20*3=60
			//fact=60*2=120
			//fact=120*1=120
			num=num-1;
		}
		num=temp;
		System.out.println("Factorial of Number "+num+ " is "+fact);
	}

}
