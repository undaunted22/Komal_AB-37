package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CountOfLinks {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.marutisuzuki.com/");
		System.out.println("The total no. of Links present " +driver.findElements(By.tagName("a")).size());
		
	}

}
