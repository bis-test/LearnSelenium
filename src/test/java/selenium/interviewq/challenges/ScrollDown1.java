package selenium.interviewq.challenges;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown1 {

	public static void main(String[] args) throws InterruptedException {


		// set the chromedriver property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Launch browser
		ChromeDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();


		// Open Application
		driver.get("http://jqueryui.com");


		// Wait for 5 second
		Thread.sleep(5000);

		// This  will scroll page 400 pixel vertical
		//The first argument is for horizontal & second argument is vertical
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");


		driver.get("file:///C:/Users/Biswajit/Desktop/wiki/goodies/scroll/horizontalscroll.html");

		// Wait for 5 second
		Thread.sleep(5000);

		// This  will scroll page 900 pixel horizontal
		//The first argument is for horizontal & second argument is vertical
		((JavascriptExecutor)driver).executeScript("scroll(900,0)");
	}


}


