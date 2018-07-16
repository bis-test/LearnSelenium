package selenium.concepts.wait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args) {
		
		//Launch browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				//open the website
				driver.get("http://leaftaps.com/opentaps");
				driver.manage().window().maximize();
				
				//Enter user id
				driver.findElementById("username").sendKeys("DemoSalesManager");
				
				//Enter the password
				driver.findElementById("password").sendKeys("crmsfa");
							
				//Click the login button
				
				WebElement button = driver.findElementByClassName("decorativeSubmit");
				//Wait
				String str="Log in";
				WebDriverWait wait = new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.invisibilityOfElementWithText(By.className("decorativeSubmit"), str));
				
				List<WebElement> alinks = driver.findElementsByTagName("a");
//				//Wait
//				WebDriverWait wait1 = new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.visibilityOfAllElements(alinks));
				
//				WebDriverWait wait1 = new WebDriverWait(driver,10);
				//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame1));
				
				
				//click the button
				button.click();
				
	
				

	}

}
