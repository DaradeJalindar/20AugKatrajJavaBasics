package stringclass;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountNumberOfCharacterOccuranceInString {
	
	public static void main(String[] args) {
		
		String s = "khfhdskjhfkjfsdf";
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	for(int i=0; i<s.length(); i++)
	{
		char cvalue = s.charAt(i);
		
		if(hm.containsKey(cvalue))
		{
			hm.put(cvalue, hm.get(cvalue)+1);
		}
		else
		{
			hm.put(cvalue, 1);
		}
		
	}
	
	System.out.println(hm);
	
	Set<Entry<Character, Integer>> keyvalue = hm.entrySet();
	
	for(Entry<Character, Integer> kv :keyvalue)
	{
		Character key = kv.getKey();
		
		Integer value = kv.getValue();
		
		System.out.print(key+""+value);
	}
	

}
	
}
	
	
