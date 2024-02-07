package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class JSAM_Xpath {

	public static void main(String[] args) throws InterruptedException {
   EdgeDriver driver=new EdgeDriver();
   driver.get("https://grotechminds.com/x-path");
   driver.manage().window().maximize();
   Thread.sleep(2000);
   WebElement fd= driver.findElement(By.xpath("(//span[@class='folder'])[1]"));
   fd.click();
   Thread.sleep(2000);
   WebElement b=driver.findElement(By.xpath("//span[@class='folder']"));
   b.click();
   Thread.sleep(2000);
   //WebElement m=driver.findElement(By.xpath("(//span[@class='folder'])[16]"));
   //m.click();
   WebElement c=driver.findElement(By.xpath("(//span[@class='folder'])[34]"));
   c.click();
	}

}
