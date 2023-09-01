package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class Pom1 {
	@FindBy(id = "email")
	private WebElement EmailTbox;
	
	@FindBy(id = "pass")
	private WebElement PwdTbox;
	
	@FindBy(id = "loginbutton")
	private WebElement LoginBox;
	public Pom1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void email(String emil)
	{
		EmailTbox.sendKeys(emil);
	}
	public void password(String pwd)
	{
		PwdTbox.sendKeys(pwd);
		
	}
	public void loginbuttn()
	{
		LoginBox.click();
	}

}
