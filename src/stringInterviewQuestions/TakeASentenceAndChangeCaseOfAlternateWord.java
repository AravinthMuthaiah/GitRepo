package stringInterviewQuestions;

public class TakeASentenceAndChangeCaseOfAlternateWord {

	public static void main(String[] args) {

		String s="A RED SEED";
		//Output A red SEED
		String s1="";
		String s6="";
		String s2="";
		String[]s3=s.split(" ");
		for(int i=0;i<s3.length;i++) {
			s1=s3[i];
			if(i%2!=0) {
					s6=s1.toLowerCase();//s6=red
					s2=s2+s6+" ";//s2="A"+red+" "//s2="A red "
					
			}else {
				s6=s1.toUpperCase();//s6=A//s6=SEED
				s2=s2+s6+" ";
				//s2=""+A+" "//s2="A "
				//s2="A red SEED "
				
			}
			
		}
		System.out.println(s2);
		
		
	}

}
