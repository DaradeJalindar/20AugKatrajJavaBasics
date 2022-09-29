package constructor;

public class College {
	
	String studentname;
	
	String city;
	
	static	String collegename= "coep";

	int rollnum;
	
	public College(String studentname, String city, int rollnum)
	{
		this.studentname= studentname;
		this.city = city;
		this.rollnum= rollnum;
	}
	
	public static void main(String[] args) {
		College s1 = new College("Daniel", "Delhi", 1);
		
		College s2 = new College("Eder", "Mumbai", 2);
		
		System.out.println(s2.city);
		
		
	}

}
