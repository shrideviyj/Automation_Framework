package santhoshsir;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {

	public static void main(String[] args)
	{
		String key="webdriver.gecko.driver";
		//browser to launch
		String value="./Software/geckodriver.exe";
				//path of driver
				System.setProperty(key, value);
				FirefoxDriver driver=new FirefoxDriver();
			

	}

}
