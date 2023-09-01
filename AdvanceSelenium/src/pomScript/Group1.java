package pomScript;

import org.testng.annotations.Test;

@Test(groups = {"functional"})//within classes
public class Group1 {
	@Test(groups = {"sanity"})//with in annotation
	public void test1()
	{
		System.out.println("compose");
	}
@Test(groups = {"sanity","regression"})
public void test2()
{
	System.out.println("sentitems");
}
@Test(groups = {"regression"})
public void test3()
{
	System.out.println("trash");
}
}
