package stringOccurance;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class VowelCountConsonentCount {

	public static void main(String[] args) {

		String s="Its Simple World";
		int vowelCount=0, consonentCount=0;
		Map<Character,Integer>mp=new LinkedHashMap<Character,Integer>();
		Map<Character,Integer>mp1=new LinkedHashMap<Character,Integer>();
		
				for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			//Vowel Count
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				vowelCount++;
				if(mp.containsKey(c)) {
					mp.put(c, mp.get(c)+1);
				}else {
					mp.put(c, 1);
				}
			}else if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')) {
				consonentCount++;
				if(mp1.containsKey(c)) {
					mp1.put(c, mp1.get(c)+1);
				}else {
					mp1.put(c, 1);
				}
			}
			
			
		}
				System.out.println("Vowel Occurance");
				Set<Entry<Character,Integer>>es=mp.entrySet();
				for(Entry<Character,Integer> e:es) {
					System.out.println(e);
				}
				System.out.println("Vowel Count "+vowelCount);
				
				System.out.println("Consonent Occurance");
				Set<Entry<Character,Integer>>es1=mp1.entrySet();
				for(Entry<Character,Integer> e1:es1) {
					System.out.println(e1);
				}
				System.out.println("Consonent Count "+consonentCount);
	}

}
