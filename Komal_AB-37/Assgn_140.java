package package_one; //write a testNG code which has three @test and a single BM 

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assgn_140  
{
  
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before Method Annotation");
	}
	@Test
	public void abc()
	{
		System.out.println("Test Case 1");
	}
	@Test
	public void pqr()
	{
		System.out.println("Test Case 2");
	}
	@Test
	public void xyz()
	{
		System.out.println("Test Case 3");
	}
	
}
