package stringInterviewQuestions;

public class CreateANewStringWithDigitAndRemainingCharacters {

	public static void main(String[] args) {

		String s="NO26 Sound";
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c)) {
				s1=s1+c;
			}else {
				s2=s2+c;
			}
		}
		String s3=s1+s2;
		System.out.println("New String with NUmber first and Character "+s3);
	}

}
