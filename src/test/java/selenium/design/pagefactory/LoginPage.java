package selenium.design.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}


	@FindBy(id="username")
	private WebElement eleUserName;


	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;


	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogin;



	public void login_leaftaps(String uid, String pwd)
	{
		eleUserName.sendKeys(uid);
		elePassword.sendKeys(pwd);
		eleLogin.click();

	}

}

