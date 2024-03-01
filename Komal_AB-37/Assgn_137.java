package package_one; //write a testNG code which has BS,BT,BC ,BM and one @test

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assgn_137 {
	@BeforeSuite
	public void bs() {
		System.out.println("Before Suite Annotation");
	}

	@BeforeTest
	public void bt() {
		System.out.println("Before Test Annotation");
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
	public void qrs() {
		System.out.println("this is the main Test Annotation");
	}
}
