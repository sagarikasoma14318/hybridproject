package genericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	public WebDriver driver;
	public propertyFile pdata = new propertyFile();
	public  webDriverUtilies web = new webDriverUtilies();
	
	@BeforeMethod
	public void openAPP() throws IOException {
		WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(pdata.getPropertyData("url"));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	{
		int status = res.getStatus();
		String name=res.getName();
		if(status==2)						// 1=pass, 2= fail, 3= skip (tasecases)
		{
			photo p = new photo();
			p.getPhoto(driver, name);
		}
	driver.quit();
	}


}
