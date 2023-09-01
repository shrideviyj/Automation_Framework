package practiceSanthoshSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareFlipkardAndAmazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=1%2B&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		driver.get("https://www.amazon.in/s?k=1%2B&rh=n%3A1389401031&ref=nb_sb_noss");
		driver.findElement(By.xpath("//div[text()='_30jeq3']"));//flipcart
		driver.findElement(By.xpath("//span[text()='17,999']"));//amazon
		
				
		
	}

}
