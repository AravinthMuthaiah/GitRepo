package stringInterviewQuestions;

public class ProgramToReverseTheCaseofSTring {

	public static void main(String[] args) {

		String s="Its Simple World";
		String s1="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isUpperCase(c)) {
				char c1=Character.toLowerCase(c);
				s1=s1+c1;
			}else {
				char c2=Character.toUpperCase(c);
				s1=s1+c2;
			}
		}
		System.out.println(s1);
	}

}
