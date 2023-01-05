package collectiondisc;

import java.util.LinkedList;

public class LinkedListDisc {

	public static void main(String[] args) {

		LinkedList<Character> ll = new LinkedList<Character>();

		ll.add('z');

		ll.add('a');

		ll.add('b');

		ll.remove(0);

		ll.set(1, 'e');

		ll.size();
		
	Character value = ll.get(1);
	
	System.out.println(value);

	}

}
