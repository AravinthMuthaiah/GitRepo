package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrangeStringInAscendingOrder {

	public static void main(String[] args) {

		String s="toyota";
				//Output: aooTty
		
		char[]c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]>c[j]) {
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
	for(int i=0;i<c.length;i++) {
		
		System.out.print(c[i]);
	}
}	
}

