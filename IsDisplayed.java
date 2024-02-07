package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsDisplayed //method indicates whether the component is present or not.
{

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		   driver.get("file:///C:/Users/ALSAFA/Downloads/learningHTML1.html");
		   driver.manage().window().maximize();
		   WebElement password= driver.findElement(By.id("121"));
		  boolean chckng_l_name=password.isEnabled();
		  if(chckng_l_name==true && password.isDisplayed()==true) 
		  {
			  password.sendKeys("1234");
		  }
		  else 
		  {
			System.out.println("Either component is not displaying or is disabled");  
		  }
		   
		   
	}

}
