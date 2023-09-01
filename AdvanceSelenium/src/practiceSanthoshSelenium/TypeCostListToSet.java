package practiceSanthoshSelenium;



import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TypeCostListToSet {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("month"));
		ArrayList<String> l=new ArrayList<>();
		TreeSet<String> t=new TreeSet<>(l);
		Select s=new Select(ele);
		List<WebElement> opt=s.getOptions();
		/*int count=opt.size();
		System.out.println(count);*/
		for( WebElement we:opt)
		{
			String t1=we.getText();
			t.add(t1);
		}
			for(String t2:t)
			{
				System.out.println(t2);
			}
		}
		

	}


