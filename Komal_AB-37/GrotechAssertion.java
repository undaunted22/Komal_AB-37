package assertion_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GrotechAssertion

{
	@Test
	public void Demo_Method() throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://github.com/undaunted22");
		String Expected_Title = "undaunted22 · GitHub";
		String Actual_Title = driver.getTitle();
		Assert.assertEquals(Actual_Title, Expected_Title, "Sorry! the strings are not matching");
		Thread.sleep(2000);

		WebElement repo = driver.findElement(By.name("button"));
		Assert.assertTrue(repo.isDisplayed(), "Sorry! item not displayed"); // if false is passed then it'll
		//here we are betting on our condition to be true,if not true then the TC will get fail.																				// fail the TC

		
		
	}

}
