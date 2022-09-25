package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryDemoAppPage {
	
@FindBy(id="course")                 
private WebElement coursetab;             //right click , go to source,click on generate the Getter and Setter..
											//select only on getcoursetab , click on generate

public WebElement getCoursetab() {             
	return coursetab;
}
@FindBy(name="addresstype")
private WebElement coursecategory;

public WebElement getCoursecategory() {
	return coursecategory;
}
@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
private WebElement seleniumtraining;

public skillraryDemoAppPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void seleniumtrainingbutton()
{
	seleniumtraining.click();
}

}
