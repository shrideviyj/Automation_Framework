package pomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomScript1 
{
@FindBy(id="twotabsearchtextbox")
private WebElement surchbuttn;      //Declaration

@FindBy(id="nav-search-submit-button")
private WebElement clickbutn;         //Declaration
//@FindBy()
public PomScript1(WebDriver driver)
{
	PageFactory.initElements(driver, this);    //Initialization
}
public void surchbox(String surch)   // Utilization for each every element we develop individual methods
{
	surchbuttn.sendKeys(surch);
}
public void clickActon()
{
	clickbutn.click();
}
{
	
}

{
	
}
}
