package stringInterviewQuestions;

public class PrintOnlyDigitInAString {

	public static void main(String[] args) {

		String s="Its Simple123";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c)) {
				System.out.println(c);
			}
		}
	}

}
