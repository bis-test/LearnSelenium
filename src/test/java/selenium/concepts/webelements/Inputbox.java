package selenium.concepts.webelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputbox {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		//open the jquery site
		driver.get("http://demo.guru99.com/test/login.html");
		
		WebElement email = driver.findElementById("email");
		email.sendKeys("biswajitsundara@gmail.com");
		
		WebElement pwd = driver.findElementById("passwd");
		pwd.sendKeys("hello");
		
		System.out.println(email.getAttribute("value"));
		Thread.sleep(500);
		email.clear();


	}

}
