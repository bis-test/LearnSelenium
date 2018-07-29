package selenium.interviewq.challenges;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLightElement {

	public static void main(String[] args) throws InterruptedException {
		
		// set the Chrome driver property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Launch browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		// Create the  JavascriptExecutor object
		JavascriptExecutor js=(JavascriptExecutor)driver; 

		// find element using id attribute
		WebElement username= driver.findElementById("email"); 

		Thread.sleep(1000);
		// call the executeScript method
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", username);


		Thread.sleep(1000);
		// call the executeScript method
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", username);


	}

}
