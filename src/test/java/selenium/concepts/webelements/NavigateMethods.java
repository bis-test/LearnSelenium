package selenium.concepts.webelements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) {


		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();


		/* 1. navigate().to("URL")
		Syntax: driver.navigate().to("URL")
        Purpose: This methods Load a new web page in the current browser window. This is done using an HTTP GET operation, and the method will block until the load is complete.    Base Signature :  boolean isSelected();
        Base Signature: public Navigation navigate() {
    					return new RemoteNavigation();
  						}
        Example: driver.navigate().to("http://www.google.com");
		 */

		driver.navigate().to("http://www.google.com");

		//perform some action
		driver.findElementByName("q").sendKeys("hello");
		driver.findElementByName("q").sendKeys(Keys.ENTER);

		/*2. navigate().refresh();
		 Syntax: driver.navigate().refresh();
		 Purpose: It refreshes the current web page
         Parameters: N/A
         Base Signature:void refresh();
		 * 
		 */
		driver.navigate().refresh();

		/*3. navigate().back()
		 Syntax: driver.navigate().back();
		 Purpose: To move back a single "item" in the web browser's history. 
		 And it will not perform any action if you are on the first page viewed.
         Parameters: N/A
         Base Signature: void back();
		 * 
		 */

		driver.navigate().back();

		/*4. navigate().forward()
		 Syntax: driver.navigate().forward();
		 Purpose: To move a single "item" forward in the web browser's history. And it will not perform any action if we are on the latest page viewed.
		 Parameters: N/A
		 Base Signature:  void forward();
		 * 
		 */

		driver.navigate().forward();

	}

}
