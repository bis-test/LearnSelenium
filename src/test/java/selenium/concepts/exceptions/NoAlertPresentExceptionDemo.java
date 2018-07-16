package selenium.concepts.exceptions;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoAlertPresentExceptionDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.freecrm.com/index.html");

		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.err.println("No alert is present on the page");
		}

	}

}
