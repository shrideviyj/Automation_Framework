package package2runs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SamplePacage {
	@Test(priority=1)
	public void data1()
	{
	Reporter.log("shee",true);	
	}
	@Test
	public void data2()
	{
		Reporter.log("hai",true);
	}

}
