package seleniumProj;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Shoe__WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		WebElement shoe_link=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[30]"));
	    shoe_link.click();
	    Set<String> selected_shoe= driver.getWindowHandles();
	    System.out.println(selected_shoe);
	    Iterator<String> pcid= selected_shoe.iterator();
	    String pid=pcid.next(); //parent id alone
	   String cid= pcid.next();  //child id alone.
	   
	   driver.switchTo().window(cid);
	   Thread.sleep(3000);
	   driver.close();
	
	}

}
