package selenium.concepts.links;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLinksByIndex {

	public static void main(String[] args) {


		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		//open google website
		driver.get("https://www.google.com/");
		
	
		//Search for priyanka chopra
		WebElement search = driver.findElementById("lst-ib");
		search.sendKeys("priyanka chopra");
		search.sendKeys(Keys.ENTER);
		
		
		//click a link using link text
		WebElement link1 = driver.findElementByLinkText("Priyanka Chopra - Wikipedia");
		link1.click();
		
		//Go back
		driver.navigate().back();
		
		
		//click the 2nd link using index
		WebElement link2 = driver.findElementByXPath("(//a[contains(text() , 'Priyanka Chopra')])[2]");
		link2.click();
		
		//Go back
		driver.navigate().back();
		
		//click the last link using index
		WebElement link3 = driver.findElementByXPath("(//a[contains(text() , 'Priyanka Chopra')])[last()]");
		link3.click();
		
		//close the driver
		driver.close();
		
		//Quit the driver
		driver.quit();

	}

}
