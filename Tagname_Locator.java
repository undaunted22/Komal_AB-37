package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Tagname_Locator {

	public static void main(String[] args) {
		 EdgeDriver driver=new EdgeDriver();
	     driver.get("file:///C:/Users/ALSAFA/Downloads/learningHTML1.html");
	     driver.manage().window().maximize();
	     driver.findElement(By.tagName("a")).click();
	}

}
