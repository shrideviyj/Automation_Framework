package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RunnerClass1 {
	@Test
	public void click1() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		Pom1 p1=new Pom1(driver);
		p1.email("shri@gmail.com");
		Thread.sleep(2000);
		p1.password("shree");
		Thread.sleep(2000);
		p1.loginbuttn();
		
		
		
		
	}

}
