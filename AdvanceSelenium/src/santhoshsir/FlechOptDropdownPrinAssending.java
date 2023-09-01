package santhoshsir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlechOptDropdownPrinAssending {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebElement driver=(WebElement) new ChromeDriver();
		((WebDriver) driver).get("https://www.facebook.com/r.php");
		WebElement ele=driver.findElement(By.id("month"));
		ArrayList<String> l=new ArrayList<String>();
		Select s=new Select(ele);
		List<WebElement> opt=s.getOptions();
		int count=opt.size();
		System.out.println(count);
		for( WebElement we:opt)
			{
			String t=we.getText();
			l.add(t);
			
			}
		Collections.sort(l);
		for(String t1:l)
		{
			System.out.println(t1);
			
		}
		
	
			
	}

}

