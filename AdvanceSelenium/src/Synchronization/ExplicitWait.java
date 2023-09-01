package Synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",  "./soft/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://developer.automationanywhere.com/challenges/AutomationAnywhereLabs-Login.html");
	//	driver.findElement(By.)
	}
	

}
