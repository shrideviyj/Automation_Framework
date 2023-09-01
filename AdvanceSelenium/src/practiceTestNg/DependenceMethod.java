package practiceTestNg;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependenceMethod {
@Test
public void compose()
{
	Reporter.log("compose",true);
}

@Test(dependsOnMethods = "compose")
public void sentitems()

{
Reporter.log("send items",true);
Assert.fail();

}
@Test(dependsOnMethods = "send items")
public void trash()
{
	Reporter.log("trash",true);
}}

