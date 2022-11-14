package stringInterviewQuestions;

public class CreateANewStringWIthUpperCaseFirst {

	public static void main(String[] args) {

		String s="Its Simple World";
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isUpperCase(c)) {
				s1=s1+c;
			}else {
				s2=s2+c;
			}
			
		}
		String s3=s1+s2;
		System.out.println("New String with UpperCase First "+s3);
	}

}
