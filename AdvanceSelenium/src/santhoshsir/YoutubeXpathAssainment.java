package santhoshsir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YoutubeXpathAssainment {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty( "webdriver.gecko.driver", "./Software/geckodriver.exe");
		
   WebDriver driver=new FirefoxDriver();
   driver.get("https://www.youtube.com/");
   Thread.sleep(2000);
   driver.findElement(By.xpath("//input[@id='search']")).sendKeys("pushpavati song");
   driver.findElement(By.xpath("//button[@id='search-icon-legacy'and@class='style-scope ytd-searchbox']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//div[@class='ytp-inline-preview-scrim']")).click();
   driver.findElement(By.xpath("//div[@class='<div class=\"yt-spec-touch-feedback-shape__fill\" style=\"\"></div>']")).click();
   
   Thread.sleep(2000);
   
   
	}

}
