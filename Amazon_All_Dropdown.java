package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_All_Dropdown {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
	     driver.get("https://www.amazon.in/");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("searchDropdownBox")).click();
	     driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
	     driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
	     driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
	     driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
	     driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
	     driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
	     driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
	     driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
	     driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
	     driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
	     driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ENTER);
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java");
	     driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
