package module1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import browser.BaseClass;
import excel.ExcelReader;

public class NewTest {
	WebDriver driver;
	BaseClass base;
	LoginPage login;
	RegistrationPage2 r;
	HomePage home;
  @BeforeClass
  public void openchromebrowser(){
  
  base =new BaseClass();
  driver=base.openbrowser();
  } 
  @DataProvider
  public Object[][] getData() throws EncryptedDocumentException, IOException
  {
	  ExcelReader E=new ExcelReader();
	  Object[][] data=E.gettestdata("LoginTest");
	  
	  return data;
  }
  @Test(  enabled = false,dataProvider = "getData")
  public void Registration(String Fname,String Lname,String Address,String City,String State,String Zip,String Phoneno,String SSN,String Username, String Password,String Cpassword) throws InterruptedException
  {
	  login=new LoginPage(driver);
	  login.ClickonRegisterBtn();
	  
	  Thread.sleep(3000);
	  
	  r=new RegistrationPage2(driver);
	  r.setFname(Fname);
	  r.setLname(Lname);
	  r.setaddress(Address);
	  r.setCity(City);
	  r.setState(State);
	  r.setZipcode(Zip);
	  r.setPhnNum(Phoneno);
	  r.setSSN(SSN);
	  r.setUsername(Username);
	  r.setPwd(Password);
	  r.setConfirmPwd(Cpassword);
	  r.ClickonRegisterButton();
	  String Expected="Your account was created successfully. You are now logged in.";
	  String actual=r.VerifyAccountopened();
	  Assert.assertEquals(actual, Expected);
	  home=new HomePage(driver);
	  home.ClickOnLogout();
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
  public void Closebrowser()
  {
	  base.Closebrowser(driver);
  }
  
  
}
