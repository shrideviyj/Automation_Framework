package qspider1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Scrept2 {
	
	@Test
	public void data6()
	{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");	
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
	}

}
