package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HealthcareAutomation {

	public static void main(String[] args) {
     EdgeDriver driver=new EdgeDriver();
     driver.get("https://katalon-demo-cura.herokuapp.com/");
     driver.manage().window().maximize();
     WebElement  apt=driver.findElement(By.id("btn-make-appointment"));
     apt.click();
     WebElement txt=driver.findElement(By.id("txt-username"));
     txt.sendKeys("Demo user");
     WebElement ps=driver.findElement(By.id("txt-password"));
     ps.sendKeys("123@Pass");
     //WebElement lo=driver.findElement(By.xpath("//button[@id='btn-login']")); by x path attribute
     WebElement lo=driver.findElement(By.id("btn-login"));  //by id attribute
     lo.click();
     
     
	}

}
