package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addToCartPage {
	
	@FindBy(id="add")
	private WebElement addbtn;

	public WebElement getAddbtn() {
		return addbtn;
	}
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement cartbtn;
	
	public addToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cartbutton()
	{
		cartbtn.click();
	}
	
	
}
