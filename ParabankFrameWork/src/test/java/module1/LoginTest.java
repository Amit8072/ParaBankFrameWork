package module1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browser.BaseClass;

public class LoginTest {
	WebDriver driver;
	BaseClass base;
	LoginPage login;
	
	@BeforeClass
	public void openchromebrowser()
	{
		base=new BaseClass();
		driver=base.openbrowser();
	}
	
	
	@Test
  public void Login() throws InterruptedException {
		
		Thread.sleep(3000);
		login=new LoginPage(driver);
//		login.setUsername();
//		login.setPassword();
		login.ClickonLoginBtn();
		
  }
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		base.Closebrowser(driver);
	}
}
