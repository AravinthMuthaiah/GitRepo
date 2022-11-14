package stringInterviewQuestions;

public class CountDigitCharactersInAString {

	public static void main(String[] args) {

		String s="Its Simple123";
		int digitCount=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c)) {
				System.out.println(c);
				digitCount++;
			}
		}
		System.out.println("Digit Count is "+digitCount);		
	}

}
