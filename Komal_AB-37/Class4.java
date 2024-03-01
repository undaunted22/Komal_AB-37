package package_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Class4 {
	@Test
	public void method4()           //IsEnable Program 
	{
		EdgeDriver driver=new EdgeDriver();
		   driver.get("https://grotechminds.com/registration/");
		   driver.manage().window().maximize();
		   WebElement FirstName=driver.findElement(By.xpath("//input[@id='fname']"));
		   boolean checkng_FirstName=FirstName.isDisplayed();	
		   if(checkng_FirstName==true) {
		   FirstName.sendKeys("India");
	}
		   else 
		   {
			 System.out.println("Nothing gets printed");  
		   }

	}
}
