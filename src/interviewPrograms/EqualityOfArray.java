package interviewPrograms;

import java.util.Arrays;

public class EqualityOfArray {

	public static void main(String[] args) {

		//To check two arrays are equal or not
		int[]a= {10,20,30,40};
		int[]b= {10,20,30,40};
		boolean status=Arrays.equals(a, b);
		if(status==true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
	}

}
