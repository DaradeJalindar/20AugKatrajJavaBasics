package collectiondisc;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDisc {
	
	public static void main(String[] args) {
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(50);
		
		ts.add(2);
		
		ts.add(90);
		
		ts.add(2);
		
		ts.add(100);
		
		ts.add(60);
		
		System.out.println(ts);
		
		
ArrayList<String> al = new ArrayList<String>();
		
//		to add the element inside the collection
		
		al.add("def");
		
		al.add("abc");
		
		al.add("ghi");
		
		al.add("xyz");
		
		al.add("def");
		
		
		TreeSet<String> ts1 = new TreeSet<String>();
		
		ts1.addAll(al);
		
		System.out.println(ts1);
		
		
	}

}
