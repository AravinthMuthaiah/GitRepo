package strings;

public class PrintCommonValuesInBothStrings {

	public static void main(String[] args) {

		String s1="Toyota";
		String s2="Fortuner";
		//Output should be o and t
		
		
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
		for(int j=0;j<s2.length();j++) {
			char c1=s2.charAt(j);
			if(c==c1) {
				System.out.println(c);
			}
		}
		}
	}

}
