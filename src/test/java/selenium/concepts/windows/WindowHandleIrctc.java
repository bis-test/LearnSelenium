package selenium.concepts.windows;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleIrctc {

	public static void main(String[] args) {
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//open the website
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();

		WebElement contact = driver.findElementByLinkText("Contact Us");	
		contact.click();

		Set<String> Allwindow = driver.getWindowHandles();
		List<String> listwindow = new ArrayList<String>();

		listwindow.addAll(Allwindow);
        int size = listwindow.size();
        System.out.println("The number of windows =" +size);
    
        String secwin = listwindow.get(1);
        driver.switchTo().window(secwin);
        
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The URL of second window  is=" +currentUrl);
        
        driver.quit();
        

	}

}
