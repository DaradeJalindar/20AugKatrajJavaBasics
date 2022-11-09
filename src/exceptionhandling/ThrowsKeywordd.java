package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeywordd {
	
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException
	
	{
		System.out.println("first line");
		
		Thread.sleep(2000);
		
		FileInputStream fis = new FileInputStream("jgfdsjgfsdjgfsdjf//bsdbfd");
		
		System.out.println("Last line");
		
		
	}

}
