package package_one;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassAnnotations {
	@BeforeSuite
	public void ab() 
	{
    System.out.println("before suite method");
   }
	@BeforeTest
	public void bt() 
	{
		System.out.println("before test method");
	}
	@BeforeClass
	public void bc() 
	{
		System.out.println("before class method");
	}
	@BeforeMethod
	public void bm() 
	{
		System.out.println("before method");
	}
	@Test
	public void testmethod() 
	{
		System.out.println("this is first main method method");
	}
	
	@AfterMethod 
		public void am() 
	{
		System.out.println("after method ");
	}
	@AfterClass
	public void ac() 
	{
		System.out.println("after class method");
	}
	@AfterTest
	public void at() 
	{
		System.out.println("after test method");
	}
	@AfterSuite
	public void as() 
	{
		System.out.println("after suite method");
	}
	@Test
	public void abcmethod() {
		System.out.println("this is the second test method");
	}
}
