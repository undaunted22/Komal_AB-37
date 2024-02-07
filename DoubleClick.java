package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
 ChromeDriver driver= new ChromeDriver();
 driver.get("https://www.amazon.in");
 driver.manage().window().maximize();
 WebElement e1=driver.findElement(By.linkText("Mobiles"));
 Actions a=new Actions(driver);
 a.doubleClick(e1).perform();
 
 
	}

}
