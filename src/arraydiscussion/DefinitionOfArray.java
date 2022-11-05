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
			
//			WAP to sort an array in ascending / descending order
			
//			WAP to find the missing number from an array: - {5, 7, 4, 3, 8}
			
//			WAP to separate 1 and 0 inside an array - {1, 0, 1, 1, 0, 1, 0, 0}
			
//			WAP to find out the common elements from the arrays:
			
//			int a[] = {1,8,5,20,6};
//			
//			int b[] = {23, 8, 85, 24,6};
//			
//			int c[] = {89,9, 62, 8,6};
			
			
			int size = a.length;
			
			System.out.println(size);
			
			
//	WAP to find out the triplets which got add to form 11
			
			int v[] = {5, 5, 1,2, 3, 3} ;
			
			
			for(int i=0; i<v.length; i++)
			{
				for(int j=i+1; j<v.length; j++)
				{
					for(int k=j+1; k<v.length; k++)
					{
						if(v[i] + v[j]+v[k] ==11)
						{
							System.out.println(v[i]+" "+ v[j]+" "+v[k]);
						}
						
					}
				}
			}
			
		
	}
	

}
