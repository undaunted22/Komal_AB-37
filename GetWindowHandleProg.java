package seleniumProj;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetWindowHandleProg {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	WebElement google_link=driver.findElement(By.xpath("//span[.='Google']"));
	google_link.click();
	String parent_id=driver.getWindowHandle();  //provide parent browser id
	Set<String> parentandchild_id=driver.getWindowHandles(); //provide parent and child browser id
	System.out.println(parent_id);
	System.out.println(parentandchild_id);
	Thread.sleep(2000);
	Iterator<String> pcid=parentandchild_id.iterator();  //return type is iterator of String
	String parent_id1=pcid.next();// the first time of next method will always give the parent id from parentandchild_id
	String child_id1= pcid.next(); // it'wll give the first child id.
	System.out.println(parent_id1);
	System.out.println(child_id1);
	
	driver.switchTo().window(child_id1); //moved the control to child window
	Thread.sleep(2000);
	driver.close();
	
	
	
	//WebElement link_google=driver.findElement(By.id("identifierId"));
	//link_google.click();
	
	
	//driver.close();
			}

}
