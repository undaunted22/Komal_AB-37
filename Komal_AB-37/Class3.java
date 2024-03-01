package package_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class3 {         //SBI LOGIN PROGRAM
	@Test
	public void method3()
	{
		FirefoxDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	    WebElement login=driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
	    login.click();
	    WebElement un=driver.findElement(By.xpath("//input[@name='userName']"));
	    un.sendKeys("Komal Rautela");
	   WebElement pwd= driver.findElement(By.xpath("//input[@name='password']"));
	   pwd.sendKeys("1234567");
	   WebElement cap=driver.findElement(By.xpath("//input[@name='loginCaptchaValue']"));
	}
}
