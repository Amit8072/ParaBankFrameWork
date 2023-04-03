package module1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import browser.BaseClass;
import excel.ExcelReader;

public class LoginTest1 {
	WebDriver driver;
	BaseClass base;
	HomePage home;
	LoginPage login;
	
	
	@BeforeClass
	  public void beforeClass() {
		base=new BaseClass();
		driver=base.openbrowser();
	  }
	
	 @DataProvider
	  public Object[][] getData() throws EncryptedDocumentException, IOException
	  {
		  ExcelReader E=new ExcelReader();
		  Object[][] data=E.gettestdata("LoginTest");
		  
		  return data;
	  }
	
	@Test(dataProvider = "getData")
	  public void Login(String Username,String Password)
	  {
		  login =new LoginPage(driver);
		  login.setUsername(Username);
		  login.setPassword(Password);
		  login.ClickonLoginBtn();
		  
		  home=new HomePage(driver);
		  home.ClickOnLogout();
	  }
  @AfterClass
  public void afterClass() {
	  base.Closebrowser(driver);
  }

}
