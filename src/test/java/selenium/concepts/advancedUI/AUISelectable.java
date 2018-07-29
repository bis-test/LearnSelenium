package selenium.concepts.advancedUI;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AUISelectable {

	public static void main(String[] args) {

		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		//open the jquery site
		driver.get("https://jqueryui.com/selectable/");

		//Switch to frame
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);

		WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		WebElement item2 = driver.findElementByXPath("//ol[@id='selectable']/li[2]");
		WebElement item3 = driver.findElementByXPath("//ol[@id='selectable']/li[3]");
		WebElement item5 = driver.findElementByXPath("//ol[@id='selectable']/li[5]");

		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(item1)
		.click(item2)
		.click(item3)
		.click(item5)
		.keyUp(Keys.CONTROL)
		.perform();




	}

}
