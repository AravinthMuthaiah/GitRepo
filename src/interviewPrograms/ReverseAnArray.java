package interviewPrograms;

import java.util.ArrayList;
import java.util.List;

public class ReverseAnArray {

	public static void main(String[] args) {

		int[]a= {10,20,30,50,90,70,80};
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
	}

}
