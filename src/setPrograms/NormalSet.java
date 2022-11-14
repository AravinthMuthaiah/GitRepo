package setPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class NormalSet {

	public static void main(String[] args) {

		Set<String> s1=new LinkedHashSet<String>();
		
		//Adding the elements in the set
		s1.add("Volvo");
		s1.add("Tesla");
		s1.add("Lamborghini");
		s1.add("Bugatti");
		
		//Size of the Set
		System.out.println("The size of the Set s1 is "+s1.size());
		
		//To check whether the particular element is present or not
		System.out.println("The Set Contains bugatti or not "+s1.contains("Bugatti"));
		
		//To check whether the set is empty or not
		System.out.println("To set is empty or not "+s1.isEmpty());
		
		Set<String> s2=new LinkedHashSet<String>();
		
		//Adding the elements from Set s1 to Set s2
		s2.addAll(s1);
		
		//The Set s2 is
		System.out.println("The Set s2 is "+s2);
		
		//To check whether both the Set s1 and Set s2 are equal or not
		System.out.println("To check whether both the set are equal or not "+s1.equals(s2));
		
		//Adding elements in Set s2
		s2.add("Ferrari");
		s2.add("Pagani");
		
		//After adding the elements the Set s2 is
		System.out.println("After adding elements the set s2 is "+s2);
		
		//To get the common elements from s2 and s2
		s2.retainAll(s1);
		System.out.println("The common elements in both the Set s1 and s2 is "+s2);
		
		//Adding some elements in s2
		s2.add("Maserati");
		s2.add("Koenigsegg");
		
		//To remove the common elements from s2 and s1
		s2.removeAll(s1);
		System.out.println("After removing the common elements in both the set "+s2);
		
		//Normal For loop
		
		for(int i=0;i<s1.size();i++) {
			System.out.println(s1);
		}
		
		//Enhanced for loop
		for(String s3:s1) {
			System.out.print(s3+" ");
			}
		
		}

}
