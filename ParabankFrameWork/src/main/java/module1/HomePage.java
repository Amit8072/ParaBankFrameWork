package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//a[text()='Open New Account']") private WebElement opennewaccount;
	@FindBy(xpath="//a[text()='Accounts Overview']") private WebElement accountoverview;
	@FindBy(xpath="//a[text()='Transfer Funds']") private WebElement transferfunds;
	@FindBy(xpath="//a[text()='Bill Pay']") private WebElement billpay;
	@FindBy(xpath="//a[text()='Find Transactions']") private WebElement findtransactions;
	@FindBy(xpath="//a[text()='Update Contact Info']") private WebElement updatecontactinfo;
	@FindBy(xpath="//a[text()='Request Loan']") private WebElement requestloan;
	@FindBy(xpath="//a[text()='Log Out']") private WebElement logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickOnLogout()
	{
		logout.click();
	}
	
	
	
}
