package selenium.interviewq.challenges;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTestingDemo {

	public static void main(String[] args) {
		// set the chrome driver property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Set the browser properties
		ChromeOptions op = new ChromeOptions();
		op.setHeadless(true);

		//Launch browser
		ChromeDriver driver = new ChromeDriver(op);

		//open the webpage
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		//print the browser title
		System.out.println(driver.getTitle());


	}

}
