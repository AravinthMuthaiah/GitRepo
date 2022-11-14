package stringInterviewQuestions;

public class CreateAProgramWhichMoveEachLetterBy2 {

	public static void main(String[] args) {

		String s="SIMPLY";
		String r="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='Y'||c=='y'||c=='Z'||c=='z') {
				c-=26;
			}
				c+=2;
				r=r+c;
			
		}
		System.out.println(r);
	}

}
