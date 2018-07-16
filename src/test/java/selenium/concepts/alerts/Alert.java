package selenium.concepts.alerts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {

		//Launch browser

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//open the website
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement trybutton = driver.findElementByXPath("//button[text()='Try it']");
        trybutton.click();
        
        org.openqa.selenium.Alert testalert = driver.switchTo().alert();
        //driver.switchTo().alert().sendKeys("Biswajit & Arun");
        //driver.switchTo().alert().accept();
        
        testalert.sendKeys("Biswajit & Arun");
        testalert.accept();
        
        System.out.println("The output text");
        
        WebElement optext = driver.findElementById("demo");
        System.out.println(optext.getText());
        
	}

}
