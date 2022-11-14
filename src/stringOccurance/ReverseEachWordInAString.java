package stringOccurance;

public class ReverseEachWordInAString {

	public static void main(String[] args) {

		String s="Its Simple World";
		//Output: stI elpmiS dlroW
		
		String[]s1=s.split(" ");
		
		String s4="";
		for(String s2:s1) {
			String s3="";	
		for(int i=s2.length()-1;i>=0;i--) {
			char c=s2.charAt(i);
			s3=s3+c;
		//s3=""+s="s"; //s3="s"+t="st"; //s3="st"+I="stI";
		//s3="stI"+e=	
		}
		s4=s4+s3+" ";
		//s4=""+"stI"+" "="stI "
		}
		System.out.println(s4);
	}

}
