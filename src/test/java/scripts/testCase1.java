package scripts;

import org.testng.annotations.Test;

import genericLibrary.baseClass;
import pomPages.addToCartPage;
import pomPages.skillraryDemoAppPage;
import pomPages.skillraryLoginPage;

public class testCase1 extends baseClass {

	@Test
	public void tc1()
	{
		skillraryLoginPage login=new skillraryLoginPage(driver);
		login.gearsbutton();
		login.skillrarydemoapplication();
		
		//switch the another tab(child window)
		web.switchingtabs(driver);
		
		skillraryDemoAppPage demoapp=new skillraryDemoAppPage(driver);
		web.mouseHover(driver, demoapp.getCoursetab());
		demoapp.seleniumtrainingbutton();
		
		
		addToCartPage ap= new addToCartPage(driver);
		web.doubleClick(driver, ap.getAddbtn());
		ap.cartbutton();
		web.alertpopup(driver);
		
	}
}
