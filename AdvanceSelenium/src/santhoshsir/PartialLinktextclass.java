package santhoshsir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinktextclass {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver");
		WebDriver driver=new ChromeDriver();
	driver.get("https:/www.google.com");
	driver.findElement(By.partialLinkText("Forgotten")).click();

	}

}
