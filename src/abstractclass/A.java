package abstractclass;


	public  abstract class A {
	
	
	public void viewProfile()
	{
		System.out.println("View profile method from A class");
	}
	
	public void editProfile()
	{
		System.out.println("Edit profile method from A class");
	}
	
	public abstract void deleteProfile();
	
	
	public abstract void addImage();
	
	public static void m1()
	{
		System.out.println("static m1 method");
	}
	
	public static void main(String[] args) {
		m1();
	}
	

	
	
	
}
