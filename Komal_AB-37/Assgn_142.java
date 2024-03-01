package package_one; /*create a class add 4 @test and in one @test add invocationCount=11 
						 find out number of test cases executed add AM and BM to it*/

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assgn_142 {

	@BeforeMethod
	public void bm() {
		System.out.println("Before Method Annotation");

	}

	@Test
	public void method1() {
		System.out.println("TC1");
	}
	@Test
	public void method2() {
		System.out.println("TC2");
	}
	@Test(invocationCount = 11)
	public void method3() {
		System.out.println("TC3");
	}
	@Test
	public void method4() {
		System.out.println("TC4");
	}
	@AfterMethod
	public void am() {
		System.out.println("After Method Annotation");
	}
}
