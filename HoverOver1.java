package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver1 {

	public static void main(String[] args) {
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.flipkart.com");
       driver.manage().window().maximize();
       WebElement e=driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
       
       Actions a1=new Actions(driver);
       a1.moveToElement(e).perform();
       WebElement shirt=driver.findElement(By.linkText("Men's T-Shirts"));
       shirt.click();
       
       
	}

}
