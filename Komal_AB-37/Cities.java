package package_one;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Cities 
{
   @Test(dataProvider="listofcity" , dataProviderClass=Cities_DataProvider.class)
	public void method1(String input) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement e1 = driver.findElement(By.name("q")); // single element search.
		e1.sendKeys(input);
		e1.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	
	
	
	
}
