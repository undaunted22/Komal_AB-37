package package_one;

import org.testng.annotations.DataProvider;

public class Cities_DataProvider 
{

	
@DataProvider(name="listofcity")
	
	public Object[][] method1()
	{
		return new Object[][] {{"Bangalore"},{"Mumbai"},{"Delhi"},{"Pune"},{"Hyderabad"}};		
	}
}
