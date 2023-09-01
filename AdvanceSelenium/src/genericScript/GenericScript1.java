package genericScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScript1 {
	public WebDriver driver;
	@BeforeMethod
	public void openApplin()
	{
System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://www.amazon.in/");
	}
	@AfterMethod
	public void closeAppln() 
	{
		driver.close();
	}
}
