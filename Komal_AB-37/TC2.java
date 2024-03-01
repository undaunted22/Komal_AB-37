package amazonTestNG_TC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TC2 extends Launch_Quit
{
	@Test
	public void login_search_Pen_logout()
	{
		
		WebElement search_box=driver.findElement(By.id("twotabsearchtextbox"));
	      search_box.sendKeys("Pen");
	      WebElement sbmt_btn=driver.findElement(By.id("nav-search-submit-text"));
	      sbmt_btn.click();
	      WebElement btn=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
	      btn.click();
	}

}
