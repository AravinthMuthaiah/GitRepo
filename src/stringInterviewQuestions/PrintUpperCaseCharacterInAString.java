package stringInterviewQuestions;

public class PrintUpperCaseCharacterInAString {

	public static void main(String[] args) {

		String s="Its Simple";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isUpperCase(c)) {
				System.out.println(c);
			}
		}
	}

}
