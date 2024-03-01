package amazonTestNG_TC;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class TC3 extends Launch_Quit
{
	@Test
	public void login_search_Pen_AddToWishlist_logout()
	{
		WebElement search_box=driver.findElement(By.id("twotabsearchtextbox"));
	      search_box.sendKeys("Pen");
	      WebElement sbmt_btn=driver.findElement(By.id("nav-search-submit-text"));
	      sbmt_btn.click();
	      WebElement btn=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
	      btn.click();
	      Set<String> prntID_chldID=driver.getWindowHandles();
	      Iterator<String> pr_ch_ID=prntID_chldID.iterator();
	      String prnt_ID1=pr_ch_ID.next();
	      String childID=pr_ch_ID.next();
	      driver.switchTo().window(childID);
	      WebElement add_wishlist=driver.findElement(By.id("wishListMainButton"));
	      add_wishlist.click();
	      
	      
	      
	}

}
