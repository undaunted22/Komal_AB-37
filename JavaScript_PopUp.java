package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript_PopUp {

	public static void main(String[] args) {
ChromeDriver driver=new  ChromeDriver();
driver.get("file:///C:/Users/ALSAFA/Desktop/learningHTML1.html");
driver.switchTo().alert().accept(); //to handle JavaScript exception.
driver.switchTo().alert().dismiss();
driver.manage().window().maximize();
WebElement popUp=driver.findElement(By.id("1"));
popUp.sendKeys("Komal"); 
	}

}
