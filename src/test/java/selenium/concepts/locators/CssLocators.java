/* author - Biswajit Sundara
 * date - 07/29/2018
 * topic - CSS locators
 * 
 * When we don't have an option to choose Id or Name, we should prefer using CSS locators 
 * as the best alternative. CSS is "Cascading Style Sheets" and it is defined to display HTML 
 * in structured and colorful styles are applied to webpage. 
 * 
 * CSS has more Advantage than Xpath.
 * CSS is much more faster and simpler than the Xpath.
 * In IE Xpath works very slow, where as Css works faster when compared to Xpath.
 *	Attribute					Symbol used
  	======================================
	Using id					use # symbol
	Using class name			use . symbol
	Using attribute				tagname[attribute='value']
	Using multiple attribute	tagname[attribute1='value1'][attribute2='value2']
	Contains					* symbol
	Starts with					^ symbol
	Ends with					$ symbol
 * 
 * 
 * 
 */


package selenium.concepts.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		Thread.sleep(2000);

		/* 1. Using attribute
		 * <input type="text" autocapitalize="off" class="form-text-input" id="usernameOrEmail" 
		 * name="usernameOrEmail" value="">
		 * 
		 * tagname[attribute='value']
		 * tagname= input
		 * attribute=id
		 * value= 'usernameOrEmail' ' 
		 * 
		 * 
		 */

		WebElement username = driver.findElementByCssSelector("input[id='usernameOrEmail']");
		username.sendKeys("abc@gmail.com");

		/* 2. Using id
		 * <input type="text" autocapitalize="off" class="form-text-input" id="usernameOrEmail" 
		 * name="usernameOrEmail" value="">
		 * 
		 * tagname#id
		 * tagname= input
		 * id= 'usernameOrEmail' 
		 * 
		 */

		WebElement username1 = driver.findElementByCssSelector("input#usernameOrEmail");
		username1.sendKeys(",def@gmail.com");

		/* 3. Using class name
		 * <input type="text" autocapitalize="off" class="form-text-input" id="usernameOrEmail" 
		 * name="usernameOrEmail" value="">
		 * 
		 * tagname.classname
		 * tagname= input
		 * class name= 'form-text-input' 
		 * 
		 */

		WebElement username2 = driver.findElementByCssSelector("input.form-text-input");
		username2.sendKeys(",ghi@gmail.com");


		/* 4. Using contains
		 * <input type="text" autocapitalize="off" class="form-text-input" id="usernameOrEmail" 
		 * name="usernameOrEmail" value="">
		 * 
		 * tagname[attribute*='<string>']
		 * tagname= input
		 * attribute=id 
		 * string=user (we are giving partial string instead of usernameOrEmail)
		 * 
		 */

		WebElement username3 = driver.findElementByCssSelector("input[id*='user']");
		username3.sendKeys(",jkl@gmail.com");


		/* 5. Using starts with
		 * <input type="text" autocapitalize="off" class="form-text-input" id="usernameOrEmail" 
		 * name="usernameOrEmail" value="">
		 * 
		 * tagname[attribute^='<string>']
		 * tagname= input
		 * attribute=id 
		 * string=user (we are giving partial string instead of usernameOrEmail)
		 * 
		 */

		WebElement username4 = driver.findElementByCssSelector("input[id^='user']");
		username4.sendKeys(",mno@gmail.com");


		/* 6. Using Ends with
		 * <input type="text" autocapitalize="off" class="form-text-input" id="usernameOrEmail" 
		 * name="usernameOrEmail" value="">
		 * 
		 * tagname[attribute$='<string>']
		 * tagname= input
		 * attribute=id 
		 * string=user (we are giving partial string instead of usernameOrEmail)
		 * 
		 */

		WebElement username5 = driver.findElementByCssSelector("input[id$='Email']");
		username5.sendKeys(",pqrs@gmail.com");

		//using inner text = tagname:contains('txt')
		//The below code is not working. need to research
		/*
		driver.get("https://www.w3schools.com/w3css/tryit.asp?filename=tryw3css_input_label_colored");
		driver.switchTo().frame("iframeResult");
		WebElement button = driver.findElementByCssSelector("button:contains('Register')");
		button.click();
		 */


		//using child. Parent to child
		//tagname[attribute=value]>tagname
		//Need to test this.
		/*

		 */


		//using child. Sibling
		//sibling::tagname
		//Need to test this.
		/*

		 */

		//using index
		//When there are multiple elements
		//index:: tagname.value attributename: n-th-of-type(3)
		//Need to test this.
		/*

		 */

	//Ref - http://aksahu.blogspot.com/2014/01/selenium-tricks-for-css-and-xpath-locators.html	

	}

}
