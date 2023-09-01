package santhoshsir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQAPracticeForm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("shridevi");
		driver.findElement(By.id("lastName")).sendKeys("patel");
		driver.findElement(By.id("userEmail")).sendKeys("mukesh@gmail.com");
		driver.findElement(By.id("userNumber")).sendKeys("9874562311");
		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.xpath("//div[text()='15']")).click();
		
		
		
		
		


	}

}
