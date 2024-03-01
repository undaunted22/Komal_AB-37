package package_one;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Amazon_TestNG {
	@Test
	public void launch() {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search_box = driver.findElement(By.id("twotabsearchtextbox"));
		search_box.sendKeys("Shoe");
		WebElement sbmt_btn = driver.findElement(By.id("nav-search-submit-text"));
		sbmt_btn.click();
	}
}
