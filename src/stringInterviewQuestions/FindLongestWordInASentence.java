package stringInterviewQuestions;

public class FindLongestWordInASentence {

	public static void main(String[] args) {

		String s="Its Simple World";
		String[]s1=s.split(" ");
		String a="",b="",c="";
			for(int i=0;i<s1.length;i++) {
				 a=s1[0];
				 b=s1[1];
				 c=s1[2];
				
			}
			int aLength=a.length();
			int bLength=b.length();
			int cLength=c.length();
			
			if(aLength > bLength && aLength>cLength) {
				System.out.println(a);
			}else if(bLength > aLength && bLength>cLength) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}
		
	}

}
