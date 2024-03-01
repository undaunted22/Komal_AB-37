package assertion_TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Google_Assert 
{

	@Test
	public void TC() {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement e1 = driver.findElement(By.name("q")); // single element search.
		e1.sendKeys("India");
		e1.sendKeys(Keys.ENTER);
		//Assert.assertEquals(driver.getTitle(), "India - Google Search");
		Assert.assertEquals(driver.getTitle(), "Inda - Google Search", "Sorry actual is not similar to expected");
	}
	
	
	
	
}
