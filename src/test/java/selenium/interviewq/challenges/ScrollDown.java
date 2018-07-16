package selenium.interviewq.challenges;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// set the chromedriver property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Launch browser
		ChromeDriver driver = new ChromeDriver();

		//open the webpage
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		//Use any of the below codes
//		WebElement ele = driver.findElementByXPath("//a[text()='Browse Jobs']");
//		ele.click();
		
		
		WebElement ele1 = driver.findElementByXPath("//a[contains(text(),'Browse Jobs')]");
		ele1.click();
		System.out.println(ele1.isDisplayed());
	}

}
