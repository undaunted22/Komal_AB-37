package seleniumProj; //Login to Facebook using id,name locator

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Launch {

	public static void main(String[] args) {
  ChromeDriver driver=new ChromeDriver();
  driver.get("https://www.facebook.com");
  driver.manage().window().maximize();
  driver.findElement(By.id("email")).sendKeys("komalrautela@gmail.com");
  driver.findElement(By.id("pass")).sendKeys("7802ujnf0");
  driver.findElement(By.name("login")).click();
  }
}
