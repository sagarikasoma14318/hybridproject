package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryLoginPage {
	
	@FindBy(xpath=" //a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	public skillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gearsbutton()
	{
		gearsbtn.click();
	}
	public void skillrarydemoapplication()
	{
		skillrarydemoapp.click();
	}
	public void searchtestbox(String key)
	{
		searchtb.sendKeys(key);
	}
	public void searchbutton()
	{
		searchbtn.click();
	}

}
