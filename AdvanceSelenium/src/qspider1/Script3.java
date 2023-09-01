package qspider1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script3 {
	@Test
public void data8()
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");	
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		}

	@Test
	public void data1()
	{
		String s="my name is camlin";
		String[]arr=s.split("");
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i].equals("is"))
			{
				String a=arr[i];
				String rev="";
				for(int j=a.length()-1;j>=0;j--)
				{
					rev=rev+a.charAt(j);
				}
				arr[i]=rev;
				}
			Reporter.log("My name is shree",true);
		
	}


	 
	}

}
