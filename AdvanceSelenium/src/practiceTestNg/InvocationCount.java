package practiceTestNg;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {

	@Test(priority=1,invocationCount=3)
	public void data1()
	{
		Reporter.log("hello",true);
	}
	@Test
	public void data2()
	{
		Reporter.log("world",true);
	}
}
