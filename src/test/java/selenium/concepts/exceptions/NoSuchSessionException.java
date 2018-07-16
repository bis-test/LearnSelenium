package selenium.concepts.exceptions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class NoSuchSessionException {

	public void login() {

		//Launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//open the website
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();

		driver.close();
		//Enter user id
		WebElement uName = driver.findElementById("username");
		uName.sendKeys("DemoSalesManager");		


	}

}
