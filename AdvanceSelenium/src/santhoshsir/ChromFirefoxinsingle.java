package santhoshsir;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromFirefoxinsingle {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");	
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
			Thread.sleep(2000);
			//driver.close();//close 1tab
			driver.quit();//close all the tabs


	}

}
