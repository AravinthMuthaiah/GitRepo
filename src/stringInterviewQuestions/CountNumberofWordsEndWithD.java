package stringInterviewQuestions;

public class CountNumberofWordsEndWithD {

	public static void main(String[] args) {

		String s="A RED SEED";
		String []s1=s.split(" ");
		int count=0;
		for(String s2:s1) {
			if(s2.endsWith("D")) {
				System.out.println(s2);
				count++;
			}
		}
		System.out.println("The Number of words End with D are "+count);
	}

}
