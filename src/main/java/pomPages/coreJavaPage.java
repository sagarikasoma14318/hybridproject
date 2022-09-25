package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coreJavaPage {
	
	@FindBy(xpath=" //a[text()=' Core Java For Selenium Trainin']")
	private WebElement corejavaforselenium;
	
	public coreJavaPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selenium()
	{
		corejavaforselenium.click();
	}

}
