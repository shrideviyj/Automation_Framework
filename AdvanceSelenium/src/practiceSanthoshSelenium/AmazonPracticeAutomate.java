package practiceSanthoshSelenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPracticeAutomate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("1+mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//img[@class='s-image'and@data-image-index='1']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		Thread.sleep(2000);
		 Set<String> wh = driver.getWindowHandles();
		
		ArrayList<String> l=new ArrayList<>(wh);
		String w1 = l.get(1);
		driver.switchTo().window(w1);
		Thread.sleep(2000);
		
		Point m = ele.getLocation();
		int x=m.getX();
		int y=m.getY();
		Thread.sleep(2000);
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.ScrollBy("+x+","+y+")");
		Thread.sleep(2000);
		
		
		
		
		
	
		
	}

}
