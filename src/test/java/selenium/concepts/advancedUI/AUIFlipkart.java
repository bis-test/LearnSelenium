package selenium.concepts.advancedUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AUIFlipkart {

	public static void main(String[] args) {
		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		System.out.println("The browser launched successfully");

		//go to flipkart
		driver.get("https://www.flipkart.com/");
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("The flipkart site opened successfully");

		WebElement electronics = driver.findElementByXPath("//span[text()='Electronics']");
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).click().perform();
		System.out.println("Electronics menu clicked successfully");

		//Click on Apple
		WebElement appleMenu = driver.findElementByXPath("//span[text()='Apple']");
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(appleMenu));
		builder.moveToElement(appleMenu).click().perform();
		System.out.println("Apple is selected successfully");

	}

}
