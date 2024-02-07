package seleniumProj;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonEndToEnd {

	public static void main(String[] args)
	{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        WebElement s=driver.findElement(By.id("twotabsearchtextbox"));
        s.sendKeys("Books");
        WebElement b=driver.findElement(By.id("nav-search-submit-button"));
        b.click();
        WebElement p=driver.findElement(By.linkText("Think and Grow Rich (Deluxe Hardbound Edition)"));
        p.click();
        //WebElement w=driver.findElement(By.linkText("Add to Wish List"));
        //w.click();
        String p1=driver.getWindowHandle();
        Set<String> c=driver.getWindowHandles();
        System.out.println(p1);
        System.out.println(c);
        
        WebElement w=driver.findElement(By.linkText(" Add to Wish List "));
        w.click();
        
        //driver.close();
        
         
		
	}

}
