package selenium.design.singleton;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		DriverInit instanceDriver = DriverInit.getInstance();
		driver = instanceDriver.openBrowser();
	}
	
	@Test
	public void test()
	{
		driver.get("https://login.salesforce.com/?locale=in");
		System.out.println("The title=" +driver.getTitle());
	}
	
	
	@AfterTest
	public void cleanup()
	{
		driver.quit();
	}

}
