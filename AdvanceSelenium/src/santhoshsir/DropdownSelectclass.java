package santhoshsir;

import java.lang.StackWalker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");	
			

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php/");
        Thread.sleep(2000);
        WebElement ele=driver.findElement(By.id("year"));
        Select s=new Select(ele);
           List<WebElement> Opt = s.getOptions();
           int count=Opt.size();
           System.out.println(count);
for(WebElement we:Opt) 
{
 System.out.println(we.getText());       
        
	}

	}}
