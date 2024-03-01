package package_one; /*create a class which has 2 @test with priority as 1,
						 and find out which one executes first */

import org.testng.annotations.Test;

public class Assgn_143 {
	@Test(priority = 2)
	public void method1() {
		System.out.println("TC1");
	}

	@Test(priority = 1)
	public void method2() {
		System.out.println("TC2");
	}

	@Test(priority = 3)
	public void method3() {
		System.out.println("TC3");
	}
}
