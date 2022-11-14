package stringInterviewQuestions;

public class StringIsPalindromeOrNot {

	public static void main(String[] args) {

		String s="Its Simple World";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			rev=rev+c;
		}
		if(rev.equals(s)) {
			System.out.println("The Sting is Palindrome");
		}else {
			System.out.println("The Sting is not a Palindrome");
		}
	}

}
