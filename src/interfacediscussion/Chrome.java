package interfacediscussion;

public class Chrome implements Browser {

	
	public void openBrowser() {
		
		System.out.println("open browser method from Chrome class");
	}

	
	public void closeBrowser() {
		System.out.println("close browser method from Chrome class");
		
	}


	public void refresh() {
		
		System.out.println("refresh browser method from Chrome class");
	}

	
	public void bookmark() {
		System.out.println("bookmark  method from Chrome class");
		
	}
	
	
	public void incognito()
	{
		System.out.println("incognito mode on");
	}
	
	

}
