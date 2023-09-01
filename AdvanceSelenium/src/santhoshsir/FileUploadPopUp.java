package santhoshsir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/FileuploadPopUp.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.name("upload file"));
		ele.sendKeys("C:\\Users\\DELL\\Pictures\\Camera Roll\\WIN_20210608_19_34_43_Pro (2).jpg");
		
		
		
		
		

	}

}
