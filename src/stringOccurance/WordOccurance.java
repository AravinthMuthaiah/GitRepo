package stringOccurance;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WordOccurance {

	public static void main(String[] args) {

		String s="Hello World Hello";
		String[]s1=s.split(" ");
		Map<String,Integer>mp=new LinkedHashMap<String,Integer>();
		for(String s2:s1) {
			if(mp.containsKey(s2)) {
				mp.put(s2,mp.get(s2)+1);
				
			}else {
				mp.put(s2, 1);
			}
		}
		Set<Entry<String,Integer>>es=mp.entrySet();
		for(Entry<String,Integer> e:es) {
			System.out.println(e);
		}
	}

}
