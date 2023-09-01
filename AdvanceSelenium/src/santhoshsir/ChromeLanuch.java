package santhoshsir;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLanuch {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		//browser to launch
		String value="./Software/chromedriver.exe";
		//path of the drivers
		
	System.setProperty(key,value);	
	ChromeDriver driver=new ChromeDriver();
		//Thread.sleep(2000);
		//driver.close();//close 1tab
		//driver.quit();

	}

}
