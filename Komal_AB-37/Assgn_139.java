package package_one; //write a testNG code which has BM,AM,two  @test

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assgn_139 {
	@BeforeMethod
	public void bm() {
		System.out.println("Before Method Annotation");
	}

	@Test
	public void mandatory2() {
		System.out.println("Main Test Annotation2");
	}

	@Test
	public void mandatory1() {
		System.out.println("Main Test Annotation1");
	}

	@AfterMethod
	public void am() {
		System.out.println("After Method Annotataion");
	}

}
