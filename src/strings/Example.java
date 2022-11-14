package strings;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		int num=5;
		//Hill pattern
		//Decreasing Space
		for(int i=1;i<=num;i++) {
			for(int j=i;j<num;j++) {
				System.out.print("  ");
			}
			//Incresing star
			for(int j=1;j<i;j++) {
				System.out.print("* ");
			}
			
			//Incresing star
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}
}