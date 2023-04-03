package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public WebDriver openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","G:\\batch22_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public void Closebrowser(WebDriver driver)
	{
		driver.quit();
		System.out.println("Broswer close");
	}
}
