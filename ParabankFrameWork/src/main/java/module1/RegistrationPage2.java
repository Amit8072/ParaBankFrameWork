package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage2 {

	@FindBy(xpath="//input[@id='customer.firstName']") private WebElement fname;
	@FindBy(xpath="//input[@id='customer.lastName']") private WebElement lname;
	@FindBy(xpath="//input[@id='customer.address.street']") private WebElement address;
	@FindBy(xpath="//input[@id='customer.address.city']") private WebElement city;
	@FindBy(xpath="//input[@id='customer.address.state']") private WebElement state;
	@FindBy(xpath="//input[@id='customer.address.zipCode']") private WebElement zipcode;
	@FindBy(xpath="//input[@id='customer.phoneNumber']") private WebElement phnnum;
	@FindBy(xpath="//input[@id='customer.ssn']") private WebElement ssn;
	@FindBy(xpath="//input[@id='customer.username']") private WebElement username;
	@FindBy(xpath="//input[@id='customer.password']") private WebElement pwd;
	@FindBy(xpath="//input[@id='repeatedPassword']") private WebElement confirmpwd;
	@FindBy(xpath="//input[@value='Register']") private WebElement registerbutton;
	@FindBy(xpath="(//p)[3]") private WebElement verifymsg;		
	
	public RegistrationPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setFname(String Fname)
	{
		fname.sendKeys(Fname);
	}
	public void setLname(String Lname)
	{
		lname.sendKeys(Lname);
	}
	public void setaddress(String Address)
	{
		address.sendKeys(Address);
	}
	public void setCity(String City)
	{
		city.sendKeys(City);
	}
	public void setState(String State)
	{
		state.sendKeys(State);
	}
	public void setZipcode(String Zip)
	{
		zipcode.sendKeys(Zip);
	}
	public void setPhnNum(String Phoneno)
	{
		phnnum.sendKeys(Phoneno);
	}
	public void setSSN(String SSN)
	{
		ssn.sendKeys(SSN);
	}
	public void setUsername(String Username)
	{
		username.sendKeys(Username);
	}
	public void setPwd(String Password)
	{
		pwd.sendKeys(Password);
	}
	public void setConfirmPwd(String Cpassword)
	{
		confirmpwd.sendKeys(Cpassword);
	}
	public void ClickonRegisterButton()
	{
		registerbutton.click();
	}
	public String VerifyAccountopened()
	{
		String actual=verifymsg.getText();
		
		return actual;
	}
	
}
