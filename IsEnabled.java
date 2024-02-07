package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsEnabled {

	public static void main(String[] args) {
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
