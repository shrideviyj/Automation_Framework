package package1run;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {
	@Test(priority=1)
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



