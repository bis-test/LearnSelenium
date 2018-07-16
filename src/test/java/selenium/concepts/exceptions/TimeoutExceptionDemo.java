package selenium.concepts.exceptions;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeoutExceptionDemo {


	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_disabled");

		WebElement frm = driver.findElementById("iframeResult");
		driver.switchTo().frame(frm);
		WebElement ele = driver.findElementByXPath("//button[text()='Click Me!']");
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(ele));


	}


}


