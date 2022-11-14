package stringInterviewQuestions;

public class PrintOnlyWordContainingO {

	public static void main(String[] args) {

		String s="Its Simple World";
		String[]s1= s.split(" ");
		for(String s2:s1) {
			if(s2.contains("o")) {
				System.out.println(s2);
			}
		}
	}

}
