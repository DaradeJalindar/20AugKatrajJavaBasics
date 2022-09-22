package categoriesofmethod;

public class FarmerAreaCalc {
	
	public static int areaCalculator(int length, int breadth)
	{
		int area = length * breadth;
		
		return area;
	}
	
	
	public static void main(String[] args) {
		
		
		int land1area = areaCalculator(10, 20);
		
		int land2area = areaCalculator(80, 20);
		
		int land3area = areaCalculator(5, 60);
		
		
		int totalarea = land1area+ land2area + land3area;
		
		System.out.println(totalarea);
		
	}

}
