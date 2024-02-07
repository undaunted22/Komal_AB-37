package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Fb_Keys {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("email")).sendKeys("komalrautela@gmail.com");
	     driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a");
	     driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"c");

	     driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");
	}

}
