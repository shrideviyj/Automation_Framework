package santhoshsir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleXpath //facebook page

{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("MUKESH PATEL");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@style='width']")).sendKeys("shridevi patel");
		Thread.sleep(2000);
		
		
		

	}

}
