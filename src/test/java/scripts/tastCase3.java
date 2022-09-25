package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.baseClass;
import pomPages.coreJavaPage;
import pomPages.skillraryLoginPage;
import pomPages.wishListPage;

public class tastCase3 extends baseClass {
	
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		skillraryLoginPage login=new skillraryLoginPage(driver);
		login.searchtestbox(pdata.getPropertyData("coursedata"));
		login.searchbutton();
		
		coreJavaPage cp=new coreJavaPage(driver);
		cp.selenium();
		
		wishListPage wp=new wishListPage(driver);
		web.switchFrame(driver);
		wp.playbutton();
		Thread.sleep(4000);
		wp.pausebutton();
		Thread.sleep(4000);
		web.switchbackFrame(driver);
		Thread.sleep(4000);
		wp.addtowishlisticon();
	}

}
