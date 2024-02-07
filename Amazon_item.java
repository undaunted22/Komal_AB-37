package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_item {

	public static void main(String[] args) {
     EdgeDriver driver=new EdgeDriver();
     driver.get("https://www.amazon.in/");
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Shoes");
     driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
     }

}
