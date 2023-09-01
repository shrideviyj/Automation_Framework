package santhoshsir;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBordAction {

	public static void main(String[] args) throws InterruptedException
	{
		
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/DELL/Desktop/sendkeyaction.html");
Thread.sleep(2000);
WebElement ele1=driver.findElement(By.xpath(" //input[@id='a1']  "));
Thread.sleep(2000);
WebElement ele2=driver.findElement(By.xpath("//input[@id='a3']"));
ele1.sendKeys(Keys.CONTROL+"a,x");
Thread.sleep(2000);
ele2.sendKeys(Keys.CONTROL+"v");
Thread.sleep(2000);
WebElement ele3=driver.findElement(By.xpath("//input[@id='a2']"));
ele3.sendKeys(Keys.CONTROL+"a,x");
Thread.sleep(2000);
ele1.sendKeys(Keys.CONTROL+"v");
ele3.sendKeys("JAVA& Selenium");



	}

}
