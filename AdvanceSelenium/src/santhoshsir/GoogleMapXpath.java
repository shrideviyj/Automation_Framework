package santhoshsir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMapXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/maps");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='eYqqWd vF7Cdb']")).click();
driver.findElement(By.xpath("//input[@id='searchboxinput']")).sendKeys("vijayanager Bangaloure karnataka");
	Thread.sleep(2000);
    
	 //driver.findElement(By.xpath("//button[@id='searchbox-searchbutton']")).click();	
        //Thread.sleep(2000);
        
		

	}

}
