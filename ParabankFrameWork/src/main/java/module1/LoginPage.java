package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@name='username']") private WebElement uname;
	@FindBy(xpath="//input[@name='password']") private WebElement password;
	@FindBy(xpath="//input[@value='Log In']") private WebElement Loginbtn;
	@FindBy(xpath="//a[text()='Forgot login info?']") private WebElement forgotpassword;
	@FindBy(xpath="//a[text()='Register']") private WebElement registerbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickonRegisterBtn()
	{
		registerbtn.click();
	}
	
	public void setUsername(String Username)
	{
		uname.sendKeys(Username);
	}
	public void setPassword(String Password)
	{
		password.sendKeys(Password);
	}
	public void ClickonLoginBtn()
	{
		Loginbtn.click();
	}
	public void ClickonForgotPasswordBtn()
	{
		forgotpassword.click();
	}


}
