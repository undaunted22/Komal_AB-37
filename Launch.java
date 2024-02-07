package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Launch {
	public static void main(String[] args) {
    ChromeDriver o=new ChromeDriver();
    o.get("https://grotechminds.com/registration/\r\n"
    		+ "");
    //System.out.println(o.getWindowHandle());
    //System.out.println(o.getWindowHandles());
    System.out.println(o.getTitle());
    o.findElement(By.id("Username")).sendKeys("Komal123");
    //System.out.println(o.getTitle());
	}
}
