package strings;

public class ReverseWordsInAString {

	public static void main(String[] args) {

		String s="Welcome to java world";
		//output: world java to Welcome
		
		String[]s1=s.split(" ");
		for(int i=s1.length-1;i>=0;i--) {
			System.out.print(s1[i]+" ");
		}
	}

}
