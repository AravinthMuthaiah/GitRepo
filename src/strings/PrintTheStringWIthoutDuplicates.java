package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintTheStringWIthoutDuplicates {

	public static void main(String[] args) {

		String s="toyota";
		Set<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
		set.add(c);	
					
			
		}
		for(Character s1:set) {
			System.out.print(s1);	
		}
		
		
	}

}
