package interviewPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintWithoutDuplicatesInArray {

	public static void main(String[] args) {

		int[]a= {10,20,30,40,50,10};
		Set<Integer>s=new LinkedHashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			s.add(a[i]);
		}
		for(Integer x:s){
			System.out.print(x+" ");
		}
	}

}
