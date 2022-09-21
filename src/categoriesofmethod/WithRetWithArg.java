package categoriesofmethod;

public class WithRetWithArg {

	public static String empId(int srno, String name)
	{
		String empid = srno+name;
		
		return empid;
	}
	
	public static void cityId(String value)
	{
		String ss= value + 1;
		
		System.out.println(ss);
	}
	
	
	public static void main(String[] args) {
		
		String id = empId(5, "Ron");
		
		System.out.println(id);
		
		
		String s = empId(8, "Diana");
		
		System.out.println(s);
		
		
		
		
		System.out.println(empId(1, "Doug"));
		
		
		cityId(s);
		
		
	}
	
	
}
