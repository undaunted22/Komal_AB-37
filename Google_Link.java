package seleniumProj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Google_Link {
	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
	     driver.get("https://www.google.com/");
	     driver.manage().window().maximize();
	     WebElement ee= driver.findElement(By.name("q")); // google search text field
	     
	}

}
