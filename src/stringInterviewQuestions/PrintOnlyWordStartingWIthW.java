package stringInterviewQuestions;

public class PrintOnlyWordStartingWIthW {

	public static void main(String[] args) {

		String s="Its Simple World";
	
		
		String[]s1=s.split(" ");
	
		for(String s2:s1) {
			if(s2.startsWith("W")) {
				System.out.println(s2);
			}
		}
	}

}
