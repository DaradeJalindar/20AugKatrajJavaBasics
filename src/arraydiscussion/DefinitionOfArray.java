package arraydiscussion;

public class DefinitionOfArray {
	
	public static void main(String[] args) {
		
//		Syntax: 
//			datatype[] variablename = new datatype[];
			
			int [] a = new int[5];
		
			
			a[0] = 20;
			a[1] = 50;
			a[2] = 10;
			a[3] = 30;
			a[4] = 5;
			
			System.out.println(a[2]);
			
//		iterating the array	
			for(int i=0; i<a.length; i++)
			{
				System.out.println(a[i]);
			}
	
//			WAP to print only the even position element of an array
			
//			WAP to print only the odd position element of an array
			
//			WAP to print the sum of even position element
			
//			WAP to add the elements which are even in the array
			
			
			int size = a.length;
			
			System.out.println(size);
			
			
			
			
		
	}
	

}
