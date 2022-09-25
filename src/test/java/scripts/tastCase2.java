package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibrary.baseClass;
import pomPages.skillraryDemoAppPage;
import pomPages.skillraryLoginPage;
import pomPages.testingPage;

public class tastCase2 extends baseClass{
	@Test
	public void tc2() throws IOException
	{
		skillraryLoginPage login=new skillraryLoginPage(driver);
		login.gearsbutton();
		login.skillrarydemoapplication();
		
		skillraryDemoAppPage demoapp=new skillraryDemoAppPage(driver);
		web.switchingtabs(driver);
		web.dropDown(demoapp.getCoursecategory(), pdata.getPropertyData("coursecategory"));
		
		testingPage tp=new testingPage(driver);
		web.dragdrop(driver, tp.getSeleniumtrainingimg(), tp.getMycarttab());
		Point loc = tp.getFacebookicon().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		web.scrollBar(driver, x, y);
		tp.facebookicon();
		
	}

}
