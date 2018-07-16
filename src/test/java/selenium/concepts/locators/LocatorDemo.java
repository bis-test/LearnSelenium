package selenium.concepts.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		//Launch the browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver= new ChromeDriver();
				driver.get("https://www.freecrm.com/index.html");
				WebElement ele = driver.findElementByTagName("a");
				ele.click();

	}

}
