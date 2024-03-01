package package_one; //write a testnNG code which has BS,AS,BM,BC,AC and one @test

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assgn_138 {
	@BeforeSuite
	public void bs() {
		System.out.println("Before Suite Annotation");
	}

	@BeforeClass
	public void bc() {
		System.out.println("Before Class Annotation");
	}

	@BeforeMethod
	public void bm() {
		System.out.println("Before Method Annotation");
	}

	@Test
	public void demo() {
		System.out.println("Test Annotation");
	}

	@AfterClass
	public void ac() {
		System.out.println("After Class Annotation");
	}

	@AfterSuite
	public void as() {
		System.out.println("After Suite Annotation");
	}
}
