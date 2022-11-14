package stringInterviewQuestions;

public class PrintStringInAlternateCases {

	public static void main(String[] args) {

		String s="Its Simple World";
		String[]s1=s.split(" ");
		
		String s4="";
		for(String s2:s1) {
			String s3="";	
			for(int i=0;i<s2.length();i++) {
				char c=s2.charAt(i);
				if(Character.isUpperCase(c)) {
					s3=s3+Character.toLowerCase(c);
						
				}else if(Character.isLowerCase(c)) {
					s3=s3+Character.toUpperCase(c);
				}	
				
			}
			s4=s4+s3+" ";
		}
		System.out.println(s4);
	}
}

