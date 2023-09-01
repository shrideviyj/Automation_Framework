package practiceSanthoshSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PractivceMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
	    Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println(url);
		String src=driver.getPageSource();
		//System.out.println(src);
		//driver.close();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	      driver.navigate().forward();
	      driver.navigate().back();
	      driver.navigate().refresh();
	      //driver.quit();
	    //  driver.manage().window();
	      //driver.findElement(By.tagName("a")).clear();
	      
	   //  driver.findElement(By.id())
	     
		
		
		

	}

}
