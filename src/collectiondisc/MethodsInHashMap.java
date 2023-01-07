package collectiondisc;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MethodsInHashMap {
	
public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Delhi");
		
		hm.put(150, "Pune");
		
		hm.put(500, "Mumbai");
		
		hm.put(300, "Satara");
		
		hm.put(900, "Baramati");
		
		System.out.println(hm);
		
//		to get all the keys
		
		Set<Integer> keys = hm.keySet();
		
		System.out.println(keys);//[800, 500, 900, 101, 300]
		
		for(Integer f:keys)
		{
			System.out.println(f);
		}
		
		
//		To get all values
		
		Collection<String> value = hm.values();
		
		
		System.out.println(value);
		
		for(String d :value)
		{
			System.out.println(d);
		}
		
		
//		To check the key available inside the map
		
	boolean ispresent = hm.containsKey(850);
	
	System.out.println(ispresent);//false
	
//	To check the value is available inside the hashmap
	
	boolean isvaluepresent = hm.containsValue("Satara");
	
	System.out.println(isvaluepresent);//true
	
	
//	To get the value for a corresponding key
	
	String valueofkey = hm.get(900);
	
	System.out.println(valueofkey);// Baramati
	
//	to interate the hashmap
	
			Set<Entry<Integer, String>> keyvalue = hm.entrySet();
	
	
		for(Entry<Integer, String> kv :keyvalue)
		{
			if(kv.getKey()>200)
			{
			System.out.println(kv.getKey() + " "+ kv.getValue());
			}
		}
		
		
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(101, "Delhi");
		
		lhm.put(150, "Pune");
		
		lhm.put(500, "Mumbai");
		
		lhm.put(300, "Satara");
		
		lhm.put(900, "Baramati");
		
		System.out.println(lhm);
		
		
}

}
