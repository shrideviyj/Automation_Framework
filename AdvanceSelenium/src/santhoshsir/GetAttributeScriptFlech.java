package santhoshsir;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeScriptFlech {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	String atti=ele.getAttribute("href");
	System.out.println(atti);
	
	
	}

}
