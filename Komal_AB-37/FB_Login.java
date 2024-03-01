package package_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FB_Login
{
	@Test(dataProvider="testdata")
    public void Login_FB(String un,String pwd)
    {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pwd);
		driver.close();
		
    }
	@DataProvider(name="testdata")
	public Object[][] data_for_login()
			
			{
		Object[][]d1=new Object [2][2];
		     d1[0][0]="ram@gmail.com";
		     d1[0][1]="sita@ram123";
		     d1[1][0]="sita@gmail.com";
		     d1[1][1]="ram@123";
		     
		     return d1;
		   
			}
		
    }

