package handlinDisableElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformScrolAction {
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=1;i<=3;i++)
		{
			js.executeScript("window.scrollBy(0,900)");
			Thread.sleep(2000);			
			
		}
		for(int j=1;j<=3;j++)
		{
			js.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(2000);		
		}

	}
	}
