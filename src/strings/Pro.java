package strings;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Pro {

	public static void main(String[] args) {

//Print only the non duplicate characters in a string
		//Literal String
		
		String s="Hello";
		String s2="Hello";
		
System.out.println("------------------.equals() and == on Literal String------------------------");
		//Will check the content of the two string so it will be false
		System.out.println(s.equals(s2));//true
		//will check the memory address of the two string so it will be false		
		System.out.println(s==s2);//true
		
		
System.out.println("-------------------Literal String----------------------------");
		int sMemory=System.identityHashCode(s);
		
		int s2Memory=System.identityHashCode(s2);
		
		System.out.println("String s memory is "+sMemory);
		System.out.println("String s1 memory is "+s2Memory);
		
		//Combining the Literal string
				String concat=s.concat(s2);
				int concatMemory=System.identityHashCode(concat);
				
				System.out.println(concat);
				System.out.println("String concat memory is "+concatMemory);
				
		//Non Literal String
	
		String s1=new String("Hello");
		String s3=new String("Hello");
		
System.out.println("------------------.equals() and == on Non Literal String------------------------");

	System.out.println(s1.equals(s3));

	System.out.println(s1==s3);
	System.out.println("-------------------Non Literal String----------------------------");
		int s1Memory=System.identityHashCode(s1);
		
		int s3Memory=System.identityHashCode(s3);
		
		
		System.out.println("String s2 memory is "+s1Memory);
		System.out.println("String s3 memory is "+s3Memory);
		
		//COmbining two string
		String concatNon=s1.concat(s3);
		
		System.out.println(concatNon);
		
		int concatNonMemory=System.identityHashCode(concatNon);
		
		System.out.println("String concat memory is "+concatNonMemory);
		
System.out.println("--------------------Mutable String---------------------------------");

String a1="world";
String a2="world";
//Combining two mutable string
String concatMutable=a1.concat(a2);

//Memory address
System.out.println("a1 memory address "+System.identityHashCode(a1));
System.out.println("a2 memory address "+System.identityHashCode(a2));
System.out.println("Concat Mutable memory address "+System.identityHashCode(concatMutable));

System.out.println("--------------------IMMutable String---------------------------------");

StringBuffer a3=new StringBuffer("world");
StringBuffer a4=new StringBuffer("world");

//Combining two Immutable string
StringBuffer appendImmutable=a3.append(a4);

//Memory address
System.out.println("a3 memory address "+System.identityHashCode(a3));
System.out.println("a3 memory address "+System.identityHashCode(a4));
System.out.println("a3 memory address "+System.identityHashCode(appendImmutable));



		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}