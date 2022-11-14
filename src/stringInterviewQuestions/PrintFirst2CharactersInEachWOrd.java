package stringInterviewQuestions;

public class PrintFirst2CharactersInEachWOrd {

	public static void main(String[] args) {

		String s="Its Simple World";
		String s3="";
		String[]s1=s.split(" ");
		for(String s2:s1) {
			char c=s2.charAt(0);
			char c1=s2.charAt(1);
			s3=s3+c+c1+" ";
			
		}
		System.out.println(s3);
	}

}
