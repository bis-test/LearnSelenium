package selenium.concepts.basics;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTitle
{
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	    driver.get("http://www.google.com");
	    driver.manage().window().maximize();
		WebElement search = driver.findElementById("lst-ib");
		search.sendKeys("Selenium", Keys.ENTER);
		
		driver.findElementByLinkText("Selenium - Web Browser Automation").click();
		
		String expectedtitle="Selenium - Web Browser Automation";
		String actualtitle="";
		actualtitle= driver.getTitle();
		
		if (actualtitle.contentEquals(expectedtitle))
		{
			System.out.println("Test Passed!");
		}
		else
		{
			System.out.println("Test Failed");
		}
	
	
	//close browser	
	 driver.close();
	
	}
	
}