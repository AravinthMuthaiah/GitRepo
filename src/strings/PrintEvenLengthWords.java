package strings;

public class PrintEvenLengthWords {

	public static void main(String[] args) {

		String s="Hell world simple";
		//Print the Hell and simple since there length are even number
		String[]s1=s.split(" ");
		for(String s2:s1) {
			if(s2.length()%2==0) {
				System.out.println(s2);
			}
		}
	}

}
