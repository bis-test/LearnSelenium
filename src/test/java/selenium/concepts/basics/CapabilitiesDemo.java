package selenium.concepts.basics;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapabilitiesDemo {

	public static void main(String[] args) {
		// set the chromedriver property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Launch browser
		ChromeDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// Open Application
		driver.get("https://www.google.com/");


		Capabilities caps = driver.getCapabilities();
		System.out.println(caps);
		
		String browserName= driver.getCapabilities().getBrowserName();
		System.out.println("The browser name= "+ browserName);
		
		Platform platformName= driver.getCapabilities().getPlatform();
		System.out.println("The platform name= " +platformName);
		
		String version = driver.getCapabilities().getVersion();
		System.out.println("The browser version = " +version);
		

	}

}
