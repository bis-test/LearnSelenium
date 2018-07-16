package selenium.concepts.exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementNotVisibleExceptionDemo {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// launch Chrome and redirect it to the Base URL
		driver.get("http://omayo.blogspot.com/");


		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='hbutton']")));
		
		
//		try 
//		{
//			WebElement butn1 = driver.findElementByXPath("//*[@id='hbutton']");
//			butn1.click();
//		} 
//		catch (ElementNotVisibleException e) 
//		{
//
//			System.err.println("Element is not visible"); 
//		}



	}

}
