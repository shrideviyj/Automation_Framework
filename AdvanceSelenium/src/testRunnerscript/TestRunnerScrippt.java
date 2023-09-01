package testRunnerscript;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericScript.GenericScript1;
import pomScript.PomScript1;

public class TestRunnerScrippt extends GenericScript1
{
	
	@Test
	public void search() throws InterruptedException
	{
	
	PomScript1 p1=new PomScript1(driver);
	p1.surchbox("vivo mobile");
	Thread.sleep(2000);
	p1.clickActon();
	

	}}
