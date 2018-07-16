package selenium.concepts.exceptions;


import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionNotFoundExceptionDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// launch Chrome and redirect it to the Base URL
		driver.get("https://www.google.com/");

		driver.close();
		try {
			driver.findElementByName("abc");
		} catch (NoSuchSessionException e) {
		    System.err.println("The browser is closed");
		}


	}

}
