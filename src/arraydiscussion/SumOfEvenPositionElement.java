package arraydiscussion;

public class SumOfEvenPositionElement {
	
	
	public static void main(String[] args) {
		
		int a []= {5, 10, 2,4,6};
		
		int sum= 0;
		
		for(int i=0; i<a.length; i++)
		{
			if(i%2==0)
			{
				sum = sum+ a[i];
			}
		}
		
		System.out.println(sum);
		
		
		
	}

}
