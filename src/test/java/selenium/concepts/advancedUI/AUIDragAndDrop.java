package selenium.concepts.advancedUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AUIDragAndDrop {

	public static void main(String[] args) {

		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		//open the jquery site
		driver.get("https://jqueryui.com/droppable/");

		//Switch to frame
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);

		WebElement draggable = driver.findElementById("draggable");
		WebElement droppable = driver.findElementById("droppable");

		Actions builder = new Actions(driver);
		Action dragdrop= builder.dragAndDrop(draggable, droppable).build();
		dragdrop.perform();



	}

}
