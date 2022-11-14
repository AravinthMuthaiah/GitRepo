package stringOccurance;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharacterOccurance {

	public static void main(String[] args) {

		String s="Its Simple World";
		Map<Character,Integer>mp=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(mp.containsKey(c)) {
				mp.put(c, mp.get(c)+1);
			}else {
				mp.put(c, 1);
			}
			
		}
		Set<Entry<Character,Integer>>es=mp.entrySet();
		for(Entry<Character,Integer> e:es) {
			System.out.println(e);
		}
	}

}
