package santhoshsir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelmentsGetmetods {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
	   List<WebElement> links = driver.findElements(By.xpath("//a"));
	   int count=links.size();
	   System.out.println(count);
	   for(WebElement  we:links)
	   {
		   String t=we.getAttribute("href");
		   System.out.println(t);
	   }
		
		
		
	}

}
