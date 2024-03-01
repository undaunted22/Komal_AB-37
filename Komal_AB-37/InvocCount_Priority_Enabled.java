package package_one;

import org.testng.annotations.Test;

public class InvocCount_Priority_Enabled 
{
	@Test(enabled=true,invocationCount=3,priority = 1)
	public void xyz() {
		System.out.println("TC1");
	}

	@Test(priority = 1)
	public void pqr() {
		System.out.println("TC2");
	}

	@Test(priority = 1)
	public void abc() {
		System.out.println("TC3");
	}
	
}
