package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

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
	
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setFname()
	{
		fname.sendKeys("Amit");
	}
	public void setLname()
	{
		lname.sendKeys("Mali");
	}
	public void setaddress()
	{
		address.sendKeys("Mahadev Nagar,Manjari road");
	}
	public void setCity()
	{
		city.sendKeys("Pune");
	}
	public void setState()
	{
		state.sendKeys("Maharashtra");
	}
	public void setZipcode()
	{
		zipcode.sendKeys("412307");
	}
	public void setPhnNum()
	{
		phnnum.sendKeys("8308843672");
	}
	public void setSSN()
	{
		ssn.sendKeys("1231423654");
	}
	public void setUsername()
	{
		username.sendKeys("sssss");
	}
	public void setPwd()
	{
		pwd.sendKeys("sssss");
	}
	public void setConfirmPwd()
	{
		confirmpwd.sendKeys("sssss");
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
