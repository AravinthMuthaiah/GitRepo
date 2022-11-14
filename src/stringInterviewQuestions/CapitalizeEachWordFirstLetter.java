package stringInterviewQuestions;

public class CapitalizeEachWordFirstLetter {

	public static void main(String[] args) {
String s="a red seed";
String s3="";
String[]s1=s.split(" ");
for(String s2:s1) {
	char c=s2.charAt(0);
	char c1=Character.toUpperCase(c);
	String s4=s2.substring(1);
	s3=s3+c1+s4+" ";
}
System.out.println(s3);
	}

}
