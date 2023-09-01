package santhoshsir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeClass //link text
{
    public static void main(String[] args) throws InterruptedException 
    {
    	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("C:/Users/DELL/Desktop/Today.html");
    	driver.findElement(By.linkText("google")).click();
    	Thread.sleep(2000);
    	
    	
    	//driver.findElement(By.linkText(""));
    	
    	
    	
	}
}
