package abstractclass;

public class C extends B{

	
	public void addImage() {
		System.out.println("Add image method from C class");
		
	}
	
	public static void main(String[] args) {
		
		
		C c = new C();
		
		c.addImage();
		
		c.viewProfile();
		
		c.editProfile();
		
		c.deleteProfile();
		
		
	}
	
	

}
