package santhoshsir;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeltchIdofAllBrowser {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='SignUp Form']")).click();
Thread.sleep(2000);
	Set<String> allwh = driver.getWindowHandles();
	int count=allwh.size();
	System.out.println(count);
	for( String wh:allwh)
	{
	System.out.println(wh);	
	}
	

	}

}
