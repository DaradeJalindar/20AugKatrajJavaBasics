package collectiondisc;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionOfArrayToArraylist {
	
	
	public static void main(String[] args) {
		
//		conversion of Array to ArrayList
		
		Integer i[] = {4, 5, 8, 50, 50};
		
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(i));
		
		
		System.out.println(al);//[4, 5, 8, 50, 50]
		
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		al2.add(50);
		
		al2.add(60);
		al2.add(10);
		
		al2.add(30);
		al2.add(40);
		
		al2.add(500);
		
		Integer[] i1 = new Integer[al2.size()];
		
		al2.toArray(i1);
		
		for(int a :i1)
		{
			System.out.println(a);
		}
		
		
	}

}
