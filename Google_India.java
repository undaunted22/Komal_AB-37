package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Google_India {

	public static void main(String[] args) {
		     EdgeDriver driver=new EdgeDriver();
		     driver.get("https://www.google.com/");
		     driver.manage().window().maximize();
		     driver.findElement(By.name("q")).sendKeys("India");
		     driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
