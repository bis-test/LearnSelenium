/*author - Biswajit Sundara
 * date - 07/29/2018
 * 
 * Selenium webdriver has many inbuilt methods to verify web elements.
 * 1. get() 
 * 2. getTitle
 * 3. getCurrentURL()
 * 4. getPageSource()
 * 5. getAttribute()
 * 6. getCssValue()
 * 7. getText()
 * 8. getLocation()
 * 9. getSize()
 * 10. getTagName()
 * 11. isDisplayed()
 * 12. isEnabled()
 * 13. isSelected()
 * 
 * Verified: Yes
 */

package selenium.concepts.webelements;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElementVerification {

	public static void main(String[] args) {

		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();


		/* 1. get()
		Syntax: get(url)
		Example: driver.get();
		Purpose: It will load a new web page in the current browser window. 
		This is done using an http get operation, and the method will block until the load is complete.
		Parameters: URL - The URL to load and it should be a fully qualified URL
		Base Signature:  Class = RemoteWebDriver
		                 public void get(String url) 
		                   {
		                     execute(DriverCommand.GET, ImmutableMap.of("url", url));
		                    }
		 */
		
		driver.get("https://www.w3schools.com/");

		/* 2. getCurrentUrl()
		Syntax: getCurrentUrl()
		Example: driver.getCurrentUrl();
		Purpose: Gets a string representing the current URL that the browser is opened.
		Returns: The URL of the page currently loaded in the browser
		For example, if you have opened google.com & you try to fetch current URL, 
		below method will help.
        Base Signature:
			public String getCurrentUrl() {
		    Response response = execute(DriverCommand.GET_CURRENT_URL);
		    if (response == null || response.getValue() == null) {
		      throw new WebDriverException("Remote browser did not respond to getCurrentUrl");
		    }
		    return response.getValue().toString();
		  }
		 */
		
		String url = driver.getCurrentUrl();
		System.out.println("The URL = "+url);


		/* 3. getTitle()
		   Syntax: getTitle()
		   Example: driver.getTitle();
		   Purpose: Gets the title of the current web page. Any leading or trailing spaces will be stripped. 
		   If there's no title, it will return 'Null'
		   Returns: The title of the current page, with leading and trailing white space stripped, 
		   or null if one is not already set
		   Base Signature:
		   		public String getTitle() 
		   		{
		   		Response response = execute(DriverCommand.GET_TITLE);
		   		Object value = response.getValue();
		   		return value == null ? "" : value.toString();
		        }
		 */
		
		String title= driver.getTitle();
		System.out.println("The Title= "+title);


		/* 4. getPageSource()
		 Syntax: getPageSource()
		 Example: driver.getPageSource();
		 Purpose: Get the source of the currently loaded page. 
		 If the page has been modified after loading (for example, by Javascript) 
		 there is no guarantee that the returned text is that of the modified page. 
		 In other words get the page source of the last loaded page. 
		 The page source returned is a presentation of the underlying DOM.
		 Returns: The source of the current page
		 Base Signature:
		 		public String getPageSource() 
		 		{
		         return (String) execute(DriverCommand.GET_PAGE_SOURCE).getValue();
                }
		 */
		 String source= driver.getPageSource();
		 System.out.println("************The Page Source *************"+source);


		/* 5. getAttribute()
		 Syntax: getAttribute("attribute name")
		 Example: driver.getAttribute("attribute name");
		 Purpose: Get the value of the given attribute of the element.. 
		 If we want to find where the link will go to
		 WebElement where = driver.findElementByLinkText("link");
		 String expectedURL= where.getAttribute("href");

		 If we want to read the value from an input box.
		 WebElement what = driver.findElementByName("username");
		 String actualtext= what.getAttribute("value");

		 Base signature: String getAttribute(String name);
		 */

		 driver.get("https://www.w3schools.com/htmL/tryit.asp?filename=tryhtml_attributes_link");
		 driver.switchTo().frame("iframeResult");
		 WebElement where = driver.findElementByLinkText("This is a link");
		 String expectedURL= where.getAttribute("href");
		 System.out.println("The href attribute = " +expectedURL);
				
		 driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_form_submit");
		 driver.switchTo().frame("iframeResult");
		 WebElement what = driver.findElementByName("FirstName");
		 String actualtext= what.getAttribute("value");
		 System.out.println("The value attribute = " +actualtext);

		/* 6. getCssValue()
		 Syntax: getCssValue("cssvaluename")
		 Example: driver. getCssValue("color")
		 Purpose: Get the value of a given css property. Color values should be returned as rgba string.
		 This is used for UI validation, which font and color we are using etc. 
		 Note that shorthand CSS properties (e.g background, font, border) are not returned 
		 in accordance with DOM2 specification.
         Base Signature : String getCssValue(String propertyName);
		 */	

		driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_link_all");
		driver.switchTo().frame("iframeResult");
		WebElement where1 = driver.findElementByLinkText("This is a link");
		String color= where1.getCssValue("color");
		System.out.println("The color of link = " +color);


		/* 6. getText()
		 Syntax: getText ()
		 Purpose: Get the visible (i.e not hidden by css) inner text of the element without any leading or trailing spaces. Inner text is text between the opening tags and closing tags.
         For example: <a>I Am Inner Text</a>
         Return: Return type of getText() method is String.
         Base Signature : String getText();
         Example: WebElement In= driver.findElementByLinkText("link");
                  String text=In.getText();
		 */	
		String text=where1.getText();
		System.out.println("The text of the link= " +text);


		/* 7. getLocation
		 Syntax: getLocation ()
         Purpose: This will return the x and y coordinate of the element. 
         This can change based on browser size & system resolution.
         Base Signature : Point getLocation();
         Example: WebElement  ele= driver.findElementByLinkText("link");
                  ele.getLocation();
                  ele.getLocation.getX();
                  ele.getLocation.getY();
		 */

		Point loc= where1.getLocation();
		System.out.println("The coordinates of link= "+loc);


		/* 8. getSize
		Syntax: getSize()
        Purpose: This method will return the width and height of the rendered element as dimension. 
        This will not change based on screen resolution
        Base Signature : Dimension getSize();
        Example: WebElement ele = driver.findElementByLinkText("link")
				 ele.getSize();
				 ele.getSize().getWidth();
				 ele.getSize().getHeight();
		 */

		driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_link_advanced");
		driver.switchTo().frame("iframeResult");
		WebElement where2 = driver.findElementByLinkText("This is a link");
		Dimension size= where2.getSize();
		System.out.println("The size of the link= "+size);


		/* 9. getTagName
		Syntax: getTagName()
        Purpose: Get the tag name of this element. 
        Base Signature : String getTagName();
        Example: Note this method will return "input" for the element.
				 <input name="username">
				 WebElement ele = driver.findElementByLinkText("link")
				 String tagname= ele.tagName();
		 */
		String tag= where2.getTagName(); //This will return 'a' since it is a link.
		System.out.println("The tagname= "+tag);


		/* 10. isDisplayed
		Syntax: isDisplayed()
        Purpose: Is this element displayed or not? If it is hidden, then it will return false. 
        Whereas if the element is not in the DOMthen findElement method cannot locate and 
        that will throw NoSuchElementException.
        Base Signature : boolean isDisplayed();
        Example: WebElement ele = driver.findElementByLinkText("link")
				 boolean isVisible= ele.isDisplayed();
		 */

		driver.get("https://www.w3schools.com/cssref/tryit.asp?filename=trycss_visibility");
		driver.switchTo().frame("iframeResult");
		WebElement head1 = driver.findElementByClassName("a");
		String text2=head1.getText();
		System.out.println("Heading text= "+text2);
		boolean flag= head1.isDisplayed();
		System.out.println("Displayed status= "+flag);


		WebElement head2 = driver.findElementByClassName("b");
		String text3=head2.getText();
		System.out.println("Heading text= "+text3);
		flag= head2.isDisplayed();
		System.out.println("Displayed status= "+flag);



		/* 11. isEnabled
		Syntax: isEnabled()
        Purpose: Is the element currently enabled or not? 
        This will generally return true for everything but disabled input elements.
        Base Signature : boolean isDisplayed();
        Example: WebElement ele = driver.findElementById("id")
                 boolean editable= ele.isEnabled();
		 */

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
		driver.switchTo().frame("iframeResult");
		WebElement ele1 = driver.findElementByName("fname");
		boolean flag1= ele1.isEnabled();
		System.out.println("Enabled status= "+flag1);


		WebElement ele2 = driver.findElementByName("lname");
		flag1= ele2.isEnabled();
		System.out.println("Enabled status= "+flag1);



		/* 12. isSelected
		Syntax: isSelected()
        Purpose: Determine whether or not this element is selected or not. 
        This operation only applies to input elements such as check boxes, options in a selected and radio buttons.
        Base Signature :  boolean isSelected();
        Example: WebElement agree = driver.findElementById("id")
                 boolean checked= agree.isSelected();
		 */

		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_js_display_checkbox_text");
		driver.switchTo().frame("iframeResult");
		WebElement check = driver.findElementById("myCheck");
		boolean selected = check.isSelected();
		System.out.println("Is the checkbox selected = " +selected);

		check.click();
		selected = check.isSelected();
		System.out.println("Is the checkbox selected = " +selected);

		driver.close();



	}

}
