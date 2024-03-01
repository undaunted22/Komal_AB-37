package assertion_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Assert 
{
 @Test
 public void tryAssertNotEquals() 
 {
	 String expected="xyz";
	 String actual="abc";
	 
	 Assert.assertNotEquals(actual, expected, "both are not equals");
 }
	
}
