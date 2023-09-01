package qspider1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script1 {
	
	@Test
	public void data1()
	{
		String s="my name is camlin";
		String[]arr=s.split("");
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i].equals("is"))
			{
				String a=arr[i];
				String rev="";
				for(int j=a.length()-1;j>=0;j--)
				{
					rev=rev+a.charAt(j);
				}
				arr[i]=rev;
				}
			Reporter.log("My name is shree",true);
		
	}

	}}
