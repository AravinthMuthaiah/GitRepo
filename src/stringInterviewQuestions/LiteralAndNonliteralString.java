package stringInterviewQuestions;

public class LiteralAndNonliteralString {

	public static void main(String[] args) {
		
		//Literal String
		String s1="Code";//s1 will be stored in String pool constant
		
		String s3="Code";//s3 will be stored in String pool constant in the same memory as of s1
		
		System.out.println(s1==s3);//true
		
		//Non Literal String
		String s2= new String("Code");//s2 will be stored in Heap Memory and also creates one more object in String Pool Constant
		
		String s4=new String ("Code");//new keyword will create a new object in Heap Memory
		
		System.out.println(s2==s4);//false
		
		//Comparing Literal String and Non Literal String
		
		System.out.println(s1==s2);//false
		
		System.out.println(s1.equals(s2));//true
		
		//== - Operator is used to check the memory address of the two Strings
		//.equals - is used to check the Content of the two Strings 
		
		
		
		
		
	}

}
