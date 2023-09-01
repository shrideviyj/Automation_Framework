package santhoshsir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FleachTextByuseingGettext {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//a[@href='/documentation']"));
		Thread.sleep(2000);
		
		String tex=ele.getText();
		System.out.println(tex);
		
		
		
	}

}
