package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedCategory {
	
	
	public static void main(String[] args) {
		
	String path = "F:\\Desktop\\Katraj\\20 Aug Katraj\\Access modifiers.docx";
		

	
		try {
			FileInputStream fis = new FileInputStream(path);
		} 
		
		
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found exception");
		}
	
	
	
		System.out.println("file not found exception arrived");

		
	
	System.out.println("Last line of the code");
		
		
	}

}
