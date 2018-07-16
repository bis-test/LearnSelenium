package selenium.concepts.exceptions;


import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchFrameExceptionDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// launch Chrome and redirect it to the Base URL
		driver.get("https://www.google.com/");

		try {
			driver.switchTo().frame("frame1");
		} catch (NoSuchFrameException e) {
			System.err.println("There's no frame with name- frame1");
		}

	}

}
