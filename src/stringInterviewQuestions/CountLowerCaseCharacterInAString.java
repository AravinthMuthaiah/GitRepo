package stringInterviewQuestions;

public class CountLowerCaseCharacterInAString {

	public static void main(String[] args) {

		String s="Its Simple";
		int lowerCaseCount=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isLowerCase(c)) {
				System.out.println(c);
				lowerCaseCount++;
			}
		}
		System.out.println("Lower Case Character Count is "+lowerCaseCount);
	}

}
