package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("nav-link-accountList"));
        Actions a1=new Actions(driver);
        a1.moveToElement(e1).perform();
        
	}

}
