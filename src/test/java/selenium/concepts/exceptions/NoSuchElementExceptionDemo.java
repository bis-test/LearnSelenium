package selenium.concepts.exceptions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementExceptionDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// launch Chrome and redirect it to the Base URL
		driver.get("https://www.google.com/");

		try 
		{
			WebElement butn1 = driver.findElementById("but1");
			butn1.click();
		} 
		catch (NoSuchElementException e) 
		{
			System.err.println("Element is not found");
		}


	}

}
