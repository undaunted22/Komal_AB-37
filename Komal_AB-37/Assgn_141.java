package package_one; /*create a class add 4 @test and in one @test 
						add invocationCount=11 find out number of test cases executed*/
import org.testng.annotations.Test;
public class Assgn_141 {
	@Test
	public void method1() {
		System.out.println("TC 1");
	}
	@Test(invocationCount = 11)
	public void method2() {
		System.out.println("TC 2");
	}
	@Test
	public void method3() {
		System.out.println("TC 3");
	}
	@Test
	public void method4() {
		System.out.println("TC 4");
	}
}
