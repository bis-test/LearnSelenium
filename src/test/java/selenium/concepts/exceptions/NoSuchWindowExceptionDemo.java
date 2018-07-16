package selenium.concepts.exceptions;

import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchWindowExceptionDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// launch Chrome and redirect it to the Base URL
		driver.get("https://www.google.com/");

		try {
			driver.switchTo().window("abc");
		} catch (NoSuchWindowException e) {
			System.err.println("Window doesn't exist");
		}

	}

}
