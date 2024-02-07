package seleniumProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Auto_Suggestion {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement e1 = driver.findElement(By.name("q")); // single element search.
		e1.sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> results = driver.findElements(By.xpath("(//div[@class='OBMEnb']/ul/li)"));
		int counting_auto = results.size();
		System.out.println(counting_auto);
		Thread.sleep(30000);
		results.get(counting_auto - 6).click();

	}

}
