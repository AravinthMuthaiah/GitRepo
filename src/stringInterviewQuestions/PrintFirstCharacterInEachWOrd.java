package stringInterviewQuestions;

public class PrintFirstCharacterInEachWOrd {

	public static void main(String[] args) {

		String s="Its Simple World";
		String s3="";		
		String[] s1=s.split(" ");

		for (String s2 : s1) {
			char c1=s2.charAt(0);
			s3=s3+c1+" ";
		}
		System.out.println(s3);
		
	}

}
