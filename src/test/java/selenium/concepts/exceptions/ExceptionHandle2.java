package selenium.concepts.exceptions;

import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandle2 {

	public static void main(String[] args) {
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//open the website
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();

		//Enter user id
		driver.findElementById("username1").sendKeys("DemoSalesManager");

	}

}
