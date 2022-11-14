package stringInterviewQuestions;

public class PrintLowerCaseCharacterInAString {

	public static void main(String[] args) {

		String s="Its Simple";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isLowerCase(c)) {
				System.out.println(c);
			}
		}
	}

}
