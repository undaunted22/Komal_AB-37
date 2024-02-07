package seleniumProj;/*Perform any action on the disabled component and 
find out which exceeption we are getting*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DisabledComp {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		   driver.get("file:///C:/Users/ALSAFA/Desktop/learningHTML1.html");
		   //driver.manage().window().maximize();
		   WebElement rv=driver.findElement(By.name("lname"));
		   rv.sendKeys("Rautela"); //org.openqa.selenium.ElementNotInteractableException

		   
		   
		   
		   

	}

}
