package collectiondisc;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetInterface {
	
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(50);
		
		hs.add(60);
		
		hs.add(50);
		
		hs.add(101);
		
		hs.add(500);
		
		hs.add(null);
		
		hs.add(null);
		
		System.out.println(hs);
		
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		
		lhs.add(50);
		
		lhs.add(60);
		
		lhs.add(50);
		
		lhs.add(101);
		
		lhs.add(500);
		
		lhs.add(null);
		
		lhs.add(null);
		
		
		System.out.println(lhs);
		
	
		
		
		
	}

}
