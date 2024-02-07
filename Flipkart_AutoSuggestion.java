package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart_AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.Flipkart.com");
	     WebElement a1=	driver.findElement(By.name("q"));
	     //Thread.sleep(2000);
	     a1.sendKeys("shirts");
	     driver.findElement(By.xpath("//form/ul/li")).click();	   
	     
	     
	  
	     
	     
	}

}
