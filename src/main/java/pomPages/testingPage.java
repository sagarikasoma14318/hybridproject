package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testingPage {
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtrainingimg;
	
	public WebElement getSeleniumtrainingimg() {
		return seleniumtrainingimg;
	}

	public WebElement getMycarttab() {
		return mycarttab;
	}

	public WebElement getFacebookicon() {
		return facebookicon;
	}

	@FindBy(id="mycart")
	private WebElement mycarttab;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookicon;
	
	public testingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void facebookicon()
	{
		facebookicon.click();
	}
}
