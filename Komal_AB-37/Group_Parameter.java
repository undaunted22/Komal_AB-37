package package_one;

import org.testng.annotations.Test;

public class Group_Parameter 
{
@Test(groups= {"smoke","system"})
public void meth1() 
{
	System.out.println("method1");
}
@Test(groups= {"system","component"})
public void meth2() 
{
	System.out.println("method2");
}
@Test(groups= {"component", "integration"})
public void meth3() {
	System.out.println("method3");
}
@Test(groups= {"integration","smoke"})
public void method4()
{
	System.out.println("method4");
}
@Test(groups={"integration","system"})
public void method5()
{
	System.out.println("method5");
}
	

	
	
	
	
	
	
}
