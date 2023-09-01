package santhoshsir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EquelMethodComparTitalOfURL {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/login/");
	String t=driver.getTitle();
	if (t.equals("https://www.facebook.com/login"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	
	}

	}
	
	

}
