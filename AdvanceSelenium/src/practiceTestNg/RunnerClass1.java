package practiceTestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerClass1 extends Generic
{
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("pallavi");
		driver.findElement(By.id("pass")).sendKeys("sindu");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
		
	}

}
