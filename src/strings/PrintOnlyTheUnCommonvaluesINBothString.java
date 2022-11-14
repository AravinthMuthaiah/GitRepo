package strings;

public class PrintOnlyTheUnCommonvaluesINBothString {

	public static void main(String[] args) {

		String s1="Toyota";
		String s2="Fortuner";
		
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
		
				char c=s1.charAt(i);
				char c1=s2.charAt(j);
				if(c!=c1) {
					System.out.println(c1);
				}
			}
			
		}
		
	}

}
