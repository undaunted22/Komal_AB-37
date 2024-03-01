package amazonTestNG_TC;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC4 extends Launch_Quit
{
	@Test
	public void login_searchPen_addTocart_logout()
	{
		WebElement search_bar=driver.findElement(By.id("twotabsearchtextbox"));
		search_bar.sendKeys("Pen");
		WebElement sbmit_btn=driver.findElement(By.id("nav-search-submit-button"));
		sbmit_btn.click();
		WebElement slct_link=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
		slct_link.click();
		Set<String> parentID_childID=driver.getWindowHandles();
		Iterator<String> prnt_chld_ID=parentID_childID.iterator();
		String parent_ID=prnt_chld_ID.next();
		String child_ID=prnt_chld_ID.next();
		driver.switchTo().window(child_ID);
		WebElement add_to_cart=driver.findElement(By.id("submit.add-to-cart"));
		add_to_cart.click();
	}

}
