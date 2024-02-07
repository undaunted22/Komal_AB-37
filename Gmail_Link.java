package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Link {
	public static void main(String[] args) {
 ChromeDriver driver=new ChromeDriver();
 driver.get("https://www.google.com");
 driver.manage().window().maximize();
 driver.findElement(By.linkText("Gmail")).click();
 driver.findElement(By.linkText("Sign in")).click();
 driver.findElement(By.id("identifierId")).sendKeys("komalrautela@gmail.com");
 
 
	}

}
