package stringInterviewQuestions;

public class PrintOnlyWordWIth3Characters {

	public static void main(String[] args) {

		String s="Its Simple World";
		String[]s1=s.split(" ");
		for(String s2:s1) {
			if(s2.length()==3) {
				System.out.println(s2);
			}
		}
	}

}
