package selenium.concepts.javaexec;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ScrollDown {

	@Test		
	public void Login() 					
	{

		//Launch the browser
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_64bit.exe");
		FirefoxDriver driver= new FirefoxDriver();

		//Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        		
        //Launching the Site.		
        driver.get("http://moneyboats.com/");			
     
        //Maximize window		
        driver.manage().window().maximize();		
        		
        //Vertical scroll down by 600  pixels		
        js.executeScript("window.scrollBy(0,600)");			

	}

}