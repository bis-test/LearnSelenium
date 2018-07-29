package selenium.concepts.windows;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExercise {

	public static void main(String[] args) {

		//Launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//open the website
		driver.get("file:///C:/Users/Biswajit/Desktop/wiki/goodies/window/windowa.html");
		driver.manage().window().maximize();
		
		System.out.println("I am at = "+driver.getTitle());
		
		String parentwindow= driver.getWindowHandle();
		
		driver.findElementById("btn1").click();
		
		
		Set<String> Allwindow = driver.getWindowHandles();
		List<String> listwindow = new ArrayList<String>();

		listwindow.addAll(Allwindow);
        int size = listwindow.size();
        System.out.println("The number of windows =" +size);
    
        String secwin = listwindow.get(1);
        driver.switchTo().window(secwin);
		

		
		System.out.println("I am at = "+driver.getTitle());
		
		driver.findElementById("btn2").click();
		
		Allwindow = driver.getWindowHandles();
		listwindow = new ArrayList<String>();

		listwindow.addAll(Allwindow);
        size = listwindow.size();
        System.out.println("The number of windows =" +size);
    
        String thwin = listwindow.get(2);
        driver.switchTo().window(thwin);
		
		System.out.println("I am at = "+driver.getTitle());
		
		WebElement head = driver.findElementById("head");
		System.out.println(head.getText());
		
		driver.switchTo().window(parentwindow);
		
		System.out.println("I am at = "+driver.getTitle());
		//driver.close();
         driver.quit();

	}

}
