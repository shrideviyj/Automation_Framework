package santhoshsir;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public abstract class OpenNewElements {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.selenium.dev/");
		WebElement ele = driver.findElement(By.xpath("//span[text()='Downloads']"));
		WebElement ele1=driver.findElement(By.xpath("//span[text()='Documentation']"));
		WebElement ele2=driver.findElement(By.xpath("//span[text()='Projects']"));
		WebElement ele3=driver.findElement(By.xpath("//span[text()='Support']"));
		WebElement ele4=driver.findElement(By.xpath("//span[text()='Blog']"));
		ArrayList<WebElement> l=new ArrayList<>();
		l.add(ele);
		l.add(ele1);
		l.add(ele2);
		l.add(ele3);
		l.add(ele4);
		Robot r=new Robot();
		for (WebElement s : l)
		{
			Actions act=new Actions(driver);
        act.contextClick(s).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_T);	
		
		}
		Set<String> w=driver.getWindowHandles();
		ArrayList<String> s1=new ArrayList<>(w);
		String m = s1.get(3);
		driver.switchTo().window(m);
		
		
		
		
		
		

	}

}
