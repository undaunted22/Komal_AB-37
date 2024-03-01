package amazonTestNG_TC; //write testNG classes for the following 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//1.login to amazon 
//2.open dropdown beside search textfiled 
//3.select books and search for any book 
//4.logout

public class TC5 extends Launch_Quit {
	@Test
	public void login_dropdwn_search_logout() throws InterruptedException {
		WebElement search_dd = driver.findElement(By.id("searchDropdownBox"));
		 Select s = new Select(search_dd);
			s.selectByVisibleText("Books");
			WebElement entr=driver.findElement(By.id("nav-search-submit-button"));
			entr.click();
			Thread.sleep(2000);
			WebElement book = driver.findElement(By.xpath("//img[@alt='Best Deals on Pearson Titles']"));
			book.click();
		

	}

}
