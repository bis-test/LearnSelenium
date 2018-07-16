package selenium.concepts.exceptions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/" );

		driver.close();
		
		throw new WebDriverException();
		
		
		//driver.findElementByName("abc");
//		
//		try {
//			driver.findElementByName("abc");
//
//		} catch (NoSuchElementException e) {
//
//			
//			throw new RuntimeException();
//			
//			//System.err.println("The element is not found");
//			//e.printStackTrace();
			
			
		}

	}


