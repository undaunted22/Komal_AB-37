package package_one;

import org.testng.annotations.Test;

public class Group_Param1 
{
@Test(groups= {"component","smoke"})
public void method1()
{
	System.out.println("its the component and smoke TCs");
}
	
@Test(groups= {"integration","system"})
public void method2() 
{
  System.out.println("its the integration and system TCs");
}
	
@Test(groups= {"integration","smoke"})
public void method3()
{
	System.out.println("its the integratin and smoke TCs");
}
}
