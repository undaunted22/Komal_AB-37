package amazonTestNG_TC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TC1 extends Launch_Quit
{
	@Test
	public void login_search_logout()
	{
		
	      WebElement search_box=driver.findElement(By.id("twotabsearchtextbox"));
	      search_box.sendKeys("Shoe");
	      WebElement sbmt_btn=driver.findElement(By.id("nav-search-submit-text"));
	      sbmt_btn.click();
	}

}
