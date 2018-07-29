/* @author - Biswajit Sundara
 * @date - 07/29/2018
 * 
 * A radio button or option button is a graphical control element that allows the user 
 * to choose only one of a predefined set of mutually exclusive options. 
 * The singular property of a radio button makes it distinct from a checkbox, 
 * which allows more than one (or no) item to be selected and for the unselected state to be restored.
 * 
 * <form action="">
 * <input type="radio" name="gender" value="male"> Male<br>
 * <input type="radio" name="gender" value="female"> Female<br>
 * <input type="radio" name="gender" value="other"> Other
 * </form>
 * 
 * When a user clicks on a radio-button, it becomes checked, 
 * and all other radio-buttons with equal name become unchecked.
 * 
 * @verified- Yes
 * 
 */

package selenium.concepts.webelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		//open the web site
		driver.get("https://www.w3schools.com/htmL/tryit.asp?filename=tryhtml_radio");
        driver.switchTo().frame("iframeResult");


		//Select the Male option
		WebElement radio1 = driver.findElementByXPath("//input[@value='male']");
		radio1.click();
		if(radio1.isSelected())
		{
			System.out.println(radio1.getAttribute("value")+" radio button is selected");
		}


		//Select the Male option
		WebElement radio2 = driver.findElementByXPath("//input[@value='female']");
		radio2.click();
		if(radio2.isSelected())
		{
			System.out.println(radio2.getAttribute("value")+" radio button is selected");
		}

		//close the driver
		driver.close();

	}

}
