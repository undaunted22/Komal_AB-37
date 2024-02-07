package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Absolute_html {

	public static void main(String[] args) {
    FirefoxDriver driver=new FirefoxDriver();
    driver.get("file:///C:/Users/ALSAFA/Downloads/learningHTML1.html");
    driver.switchTo().alert().accept();   /*org.openqa.selenium.UnhandledAlertException 
                                           if pop up is not handled*/
    driver.manage().window().maximize();
    driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("komalrautela");
    driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("ABCD");
    driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("##xyz");
    driver.findElement(By.name("fname")).sendKeys("Komal");
    driver.findElement(By.xpath("(/html/body/form/input)[3]")).click();
	}

}
