package listPrograms;

import java.util.ArrayList;
import java.util.List;

public class NormalList {

	public static void main(String[] args) {

		List<String>lis=new ArrayList<String>();
		
		//Adding the elements in the list
		lis.add("Java");
		lis.add("Python");
		lis.add("C Sharp");
		lis.add("Ruby");
		
		System.out.println("Before Adding the Element in the Last index "+lis);
		
		//Adding the Elements in the last Index
		lis.add("C++");
		System.out.println("After Adding the Element in the Last index "+lis);
		
		//Adding the elements in the particular index
		lis.add(0, "C");
		System.out.println("After Adding the Element in the First Index "+lis);
		
		//To Replace an element in particular index
		lis.set(3, "c#");
		System.out.println("After Replacing the C sharp in to C#"+lis);
		
		//To delete an element in particular index
		lis.remove(0);
		System.out.println("After Removing the element in the first index"+lis);
		
		
		
		//Getting the element from the particular index
		System.out.println("Getting the Element from the 3rd Index "+lis.get(3));
		
		//Adding the elements from One list in to another list
		List<String> lis2=new ArrayList<String>();
		
		System.out.println("Before adding elements from List 1 to List 2 "+lis2);
		
		lis2.addAll(lis);
		
		System.out.println("After adding elements from List 1 to List 2 "+lis2);
		
		//Adding some elements in the List 2
		lis2.add("Selenium");
		lis2.add("Junit");
		lis2.add("Java");
		
		System.out.println("After adding the extra elements in List 2"+lis2);
		
		//To get the index of particular element
		int indexOfJunit=lis2.indexOf("Junit");
		System.out.println("The index of Junit is "+indexOfJunit);
		
		//To get the Last index of particular element
		int lastIndexOfJava=lis2.lastIndexOf("Java");
		System.out.println("The Last index of Java is "+lastIndexOfJava);
		
		//To get the common elements from both the List1 and List2
		 lis2.retainAll(lis);
		System.out.println("Common Elements in List 1 and List 2 is "+lis2);
		
		lis2.add("TestNg");
		lis2.add("Cucumber");
		
		//To remove common elements from both the List 1 and List 2
		lis2.removeAll(lis);
		System.out.println("After removing the common elements from List 1 and List 2"+lis2);
				
		//To check whether the element is present or not
		System.out.println("The List 2 Contains Java or not "+lis2.contains("Java"));
		
		//To Check whether both the List 1 and List 2 are equal
		System.out.println("Checking whether both the List 1 and List 2 are equal "+lis2.equals(lis));
		
		
		
		
		//Normally Priting the List
		
		System.out.println("---------Printing the list Normally---------");
		
		System.out.println("Normally Printing the List "+lis);
		
		//Printing the List with For Enhanced loop
		
		System.out.println("---------Printing the list with Enhanced For loop---------");
		
		for(String lis1:lis) {
			System.out.println(lis1);
		}
		
		//Printing the List with the Normal For Loop
		
		System.out.println("---------Printing the list with Normal For loop---------");
		
		for(int i=0;i<lis.size();i++) {
			String s=lis.get(i);
			System.out.println(s);
		}
	}

}
