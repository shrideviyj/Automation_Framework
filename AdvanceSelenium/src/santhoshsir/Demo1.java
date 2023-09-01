package santhoshsir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetPageSource;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https:/www.google.com");
String h=driver.getTitle();
System.out.println(h);
 String m=driver.getCurrentUrl();
Thread.sleep(2000);
System.out.println(m);

String k = driver.getPageSource();
System.out.println(k);
driver.close();




	}

}
