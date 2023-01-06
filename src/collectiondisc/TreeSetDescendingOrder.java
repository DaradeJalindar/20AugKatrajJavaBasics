package collectiondisc;

import java.util.TreeSet;

public class TreeSetDescendingOrder {
	
	
	public static void main(String[] args) {
TreeSet<Integer> ts = new TreeSet<Integer>(new MyComp());
		
		ts.add(50);
		
		ts.add(2);
		
		ts.add(90);
		
		ts.add(2);
		
		ts.add(100);
		
		ts.add(60);
		
		System.out.println(ts);
	}

}
