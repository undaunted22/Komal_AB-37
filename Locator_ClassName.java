package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Locator_ClassName {

	public static void main(String[] args) {
      EdgeDriver driver=new EdgeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.com/");
      driver.findElement(By.className("gLFyf")).sendKeys("India");                    
	}
}
