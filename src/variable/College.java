package variable;

public class College {
	
	String studentname;
	
	String city;
	
	static	String collegename= "coep";

	int rollnum;
	
	public static void main(String[] args) {
		
		College s1 = new College();
		
		s1.studentname = "Daniel";
		
		s1.city  = "Kolkata";
		
		s1.rollnum = 1;
		
		System.out.println(s1.rollnum);
				
	}
	
}
