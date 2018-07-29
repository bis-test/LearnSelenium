package selenium.concepts.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		
		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		
		
		WebElement username = driver.findElementById("username");
		username.sendKeys("abc@gmail.com");
		
		WebElement pass = driver.findElementByName("pw");
		pass.sendKeys("hey");
		
		
//		WebElement link1 = driver.findElementByLinkText("Use Custom Domain");
//		link1.click();
		
		
//		WebElement link2 = driver.findElementByPartialLinkText("Password");
//		link2.click();
		
		
		List<WebElement> links = driver.findElementsByTagName("a");
		System.out.println(links);
		
		WebElement check = driver.findElementByClassName("input r4 wide mb16 mt8 username");
		check.sendKeys("def");

	}

}
