package stringInterviewQuestions;

public class CountNumberOfWordsInASentence {

	public static void main(String[] args) {

		String s="Its Simple World";
		String[]s1=s.split(" ");
		
		int count=0;
		for(String s2:s1) {
			count++;
		}
		System.out.println("The number of words in a sentence is "+count);
	}

}
