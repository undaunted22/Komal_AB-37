package package_one;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProv_Double 
{
  @Test(dataProvider="Double_Data")
  public void meth1(double num)
  {
	  System.out.println(num/10
			  );
	  
  }
  
  @DataProvider(name="Double_Data")
  public Object[][] methodDemo()
  {
	  return new Object[][] {{20.90},{38.45},{80.12},{60.34}};
  }	
	
}
