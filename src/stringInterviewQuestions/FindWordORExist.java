package stringInterviewQuestions;

public class FindWordORExist {

	public static void main(String[] args) {

		String s="MOM OR DAD";
		String[]s1=s.split(" ");
		for(String s2:s1) {
			if(s2.contains("OR")) {
				System.out.println(s2);
			}
		}
	}

}
