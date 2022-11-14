package stringInterviewQuestions;

public class PrintSpecialWordInAString {

	public static void main(String[] args) {

		String s="MOM OR DAD";
		
		//Special word with start with same character and end with same character
		//Here the special word is MOM and DAD
		
		String[]s1=s.split(" ");
		for(String s2:s1) {
			char c=s2.charAt(0);
			char c1=s2.charAt(s2.length()-1);
			if(c==c1) {
				System.out.println(s2);
			}
		}
		
	}

}
