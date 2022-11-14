package interviewPrograms;

public class LargestOf3Numbers {

	public static void main(String[] args) {

		int a=10, b=30, c=70;
		
		if(a>b && a>c) {
			System.out.println(a+" is Greater than b and c");
		}else if(b>a && b>c){
			System.out.println(b+" is Greater than a and c");
		}else {
			System.out.println(c+" is Greater than a and b");
		}
	}

}
