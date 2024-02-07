package seleniumProj; /*Launch GrowTechminds registration form,for firstname textfield enter name as 
Manish Kumar Tiwari, remove Tiwari from it using Keys option*/

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Surname_Backspace {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
	     driver.get("https://grotechminds.com/registration/");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("fname")).sendKeys("Manish Kumar Tiwari");
	     driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
	     driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
	     driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
	     driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
	     driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
	     driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
	     driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
	}

}
