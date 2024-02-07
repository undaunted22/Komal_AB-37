package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Pop_up {

	public static void main(String[] args) {
    EdgeDriver driver=new EdgeDriver();
    driver.get("https://grotechminds.com/registration/");
    driver.manage().window().maximize();
    WebElement w=driver.findElement(By.id("Resume"));  //windows pop up handle
    w.sendKeys("C:\\Users\\ALSAFA\\Downloads\\Pdf file.pdf");  //location properties
	}

}
