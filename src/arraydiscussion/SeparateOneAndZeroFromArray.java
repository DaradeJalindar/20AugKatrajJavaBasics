package arraydiscussion;

import java.util.Arrays;

public class SeparateOneAndZeroFromArray {
	
	
	public static void main(String[] args) {
		
		int a [] = {1, 1, 0, 1, 0, 1, 0, 0};
		
//		Arrays.sort(a);
		
		int c;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++ )
			{
				if(a[i]<a[j])
				{
					c= a[j];
					
					a[j] = a[i];
					
					a[i] = c;
				}
			}
		}
		
		
		for(int aa:a)
		{
			System.out.print(aa+" ");
		}
	}

}
