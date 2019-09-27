package Frame_design;

import org.testng.Assert;

public class Validation_Operation {

	public static String validatingTestScript(String actual, String expected)
	{
		try
		{
		Assert.assertEquals(actual, expected);
		return "pass";
		}
		catch(AssertionError rv)
		{
			return "fail";
		}
	}
	
}
