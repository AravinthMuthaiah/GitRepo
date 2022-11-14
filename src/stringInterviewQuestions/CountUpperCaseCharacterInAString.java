package stringInterviewQuestions;

public class CountUpperCaseCharacterInAString {

	public static void main(String[] args) {

		String s="Its Simple";
		int upperCaseCount=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isUpperCase(c)) {
				System.out.println(c);
				upperCaseCount++;
			}
		}
		System.out.println("Upper Case Character Count "+upperCaseCount);
	}

}
