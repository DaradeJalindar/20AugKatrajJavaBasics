package collectiondisc;

import java.util.ArrayList;

public class ArrayListDisc {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();
		
//		to add the element inside the collection
		
		al.add("def");
		
		al.add("abc");
		
		al.add("ghi");
		
		al.add("xyz");
		
		al.add("def");
		
		System.out.println(al);//[def, abc, ghi, xyz, def]
		
//		to get the total number of elements present inside the Collection / ArrayList
		int length = al.size();
		
		System.out.println(length);//5
		
//to remove the element 
		al.remove("xyz");
		
		System.out.println(al);//[def, abc, ghi, def]
	
//		to remove the element based on the index position
		al.remove(2);
		
		System.out.println(al);//[def, abc, def]
		
		
//		to get the element from the list
		
	String element = al.get(0);
	
	System.out.println(element);//def
	
//	to get the index position of element
	
	int indexposition = al.indexOf("def");
	
	System.out.println(indexposition);//0
	
	
	ArrayList<String> al2 = new ArrayList<String>(al);
	
	
	
	System.out.println(al2);//[def, abc, def]
	
	al2.add("Pune");
	
	al2.add("Mumbai");
	
	al2.add("Delhi");
	
	System.out.println(al2);//[def, abc, def, Pune, Mumbai, Delhi]
	
	boolean ispresent = al2.contains("xyz");
	
	System.out.println(ispresent);//false
	
	boolean ispresent2 = al2.contains("Delhi");
		
	System.out.println(ispresent2);//true
	
	boolean iscollectionpresent = al2.containsAll(al);
	
	System.out.println(iscollectionpresent);//true
	
//	to update the value of element at a specific index position
	al2.set(3, "Bengaluru");
	
	System.out.println(al2);//[def, abc, def, Bengaluru, Mumbai, Delhi]
	
	
//	to iterate the arraylist:
	
	
	for(String value:al2)
	{
		System.out.println(value);
	}
	
	
//WAP to add the value of hyderabad only if Bengaluru is present in the list
	
	
	
	
		
		
	}

}
