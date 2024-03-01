package package_one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class1 {         //CountOfLinks Program
	@Test
	public void method1()
	{
		FirefoxDriver driver =new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.flipkart.com");
		   List<WebElement> links=driver.findElements(By.tagName("a"));
		   System.out.println("the no. of links present are " +links.size());
		   
		   for(int i=0;i<=links.size()-1;i++) {
			   WebElement a= links.get(i);
			  String url1= a.getAttribute("href");
			  System.out.println(url1);
		   }
	}
}
