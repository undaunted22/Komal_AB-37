package seleniumProj; //print all link's link text

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Links_LinkText {

	public static void main(String[] args) {
 EdgeDriver driver=new EdgeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.flipkart.com");
 List<WebElement> links=driver.findElements(By.tagName("a"));
 System.out.println("the no. of links present in this webpage are " +links.size());
 
 for(int i=0;i<=links.size()-1;i++) {
	 WebElement l=links.get(i);
	 String text_message=l.getText();
	 System.out.println(text_message);
 }
 
	}

}
