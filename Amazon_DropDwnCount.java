package seleniumProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_DropDwnCount {

	public static void main(String[] args)
	{
       EdgeDriver driver=new EdgeDriver();
       driver.get("https://www.amazon.in");
       WebElement sr=driver.findElement(By.id("searchDropdownBox"));
       sr.click();
       Select s1=new Select(sr);
       List<WebElement> d=s1.getOptions();
       int c=d.size();
       System.out.println(c);
       String t= sr.getText();
       System.out.println(t);
       
       
       
		
	}

}
