package stringInterviewQuestions;

public class PrintOnlyWordEndwithle {

	public static void main(String[] args) {

		String s="Its Simple World";
		
		String[]s1=s.split(" ");
		for(String s2:s1) {
			if(s2.endsWith("le")) {
				System.out.println(s2);
			}
		}
	}

}
