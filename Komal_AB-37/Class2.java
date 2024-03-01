package package_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Class2 
{
	@Test
	public void method2()      //Hover Over Action class Program
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("nav-link-accountList"));
        Actions a1=new Actions(driver);
        a1.moveToElement(e1).perform();
	}
}
