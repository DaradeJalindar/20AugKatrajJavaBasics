package arraydiscussion;

import java.util.Arrays;

public class MissingNumberFromArray {
	
	public static void main(String[] args) {
		
		int a[] = {5, 7, 4, 3, 8};
		
		
		
		Arrays.sort(a);//3, 4, 5, 7, 8, 10
		
		for(int i=0; i<a.length; i++)
		{
			if(!(a[i]+1 == a[i+1]))
			{
				System.out.println(a[i]+1);
				break;
			}
		}
		
		
		
	}

}
