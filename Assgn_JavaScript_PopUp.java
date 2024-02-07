package seleniumProj; //Handle JavaScript Popup and find the title of the page after it.

import org.openqa.selenium.edge.EdgeDriver;

public class Assgn_JavaScript_PopUp {

	public static void main(String[] args) {
    EdgeDriver driver=new EdgeDriver();
    driver.manage().window().maximize();
    driver.get("https://grotechminds.com/javascript-popup/");
    driver.switchTo().alert().accept();
    String a=driver.getTitle();
    System.out.println(a);
    
	}
}
