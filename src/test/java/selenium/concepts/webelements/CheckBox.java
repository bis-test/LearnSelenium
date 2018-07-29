package selenium.concepts.webelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {

		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		//open the web site
		driver.get("https://www.computerhope.com/jargon/c/checkbox.htm");
		
		WebElement chkbox = driver.findElementById("Example-1");
		
		//Tick the checkbox
		chkbox.click();
		
		if(chkbox.isSelected())
		{
			System.out.println("Checkbox is selected");
		}
	
			
		
		//Uncheck the checkbox
		chkbox.click();
		if(!chkbox.isSelected())
		{
			System.out.println("Checkbox is not selected");
		}

	}

}
