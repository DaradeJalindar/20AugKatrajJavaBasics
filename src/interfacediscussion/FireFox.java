package interfacediscussion;

public class FireFox implements Browser {


public void openBrowser() {
		
		System.out.println("open browser method from firefox class");
	}

	
	public void closeBrowser() {
		System.out.println("close browser method from firefox class");
		
	}


	public void refresh() {
		
		System.out.println("refresh browser method from firefox class");
	}

	
	public void bookmark() {
		System.out.println("bookmark  method from firefox class");
		
	}
	
	public void privateWindow()
	{
		System.out.println("private window for firefox browser");
	}
	
	
	public static void main(String[] args) {
		
		FireFox ff = new FireFox();
		
		ff.openBrowser();
	}

}
