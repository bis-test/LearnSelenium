package selenium.concepts.xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//open the website
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		//Enter user id
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter the password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click the login button
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		//Click the crmfsa link
		driver.findElementByLinkText("CRM/SFA").click();
		
		
		//Click create account
	    driver.findElementByLinkText("Leads").click();
	    
	    driver.findElementByLinkText("Find Leads").click();
	    
	    WebElement leadid = driver.findElementByName("id");
	    leadid.sendKeys("10005");
	    driver.findElementByXPath("//button[text()='Find Leads']").click();
	    
	    driver.findElementByLinkText("Merge Leads").click();
	    driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
	    
	}

}
