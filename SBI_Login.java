package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SBI_Login {

	public static void main(String[] args) {
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
