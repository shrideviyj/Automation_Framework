package santhoshsir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ArraylistUsingReverceOrder {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
  WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/r.php");
Thread.sleep(2000);
WebElement ele=driver.findElement(By.id("month"));
ArrayList<String> l=new ArrayList<>();
Select s=new Select(ele);
List<WebElement> opt=s.getOptions();
int count=opt.size();
System.out.println(count);

for(WebElement we:opt)
{
	String t=we.getText();
	l.add(t);
}
Collections.sort(l,Collections.reverseOrder());
for(String t1:l)
{
	System.out.println(t1);
}

	}

	
		}


