package seleniumProj; /*Launch GrowTechminds registration form,Enter "Manish Kumar Tiwari"
in the firstname and copy paste in all 4 text fields using keys */
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Assgn122 {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
	     driver.get("https://grotechminds.com/registration/");
	     driver.manage().window().maximize();
	     WebElement fn=driver.findElement(By.xpath("//input[@id='fname']"));
	     fn.sendKeys("Manish Kumar Tiwari");
	     fn.sendKeys(Keys.CONTROL+"a");
	     fn.sendKeys(Keys.CONTROL+"c");
	     WebElement ln=driver.findElement(By.xpath("//input[@id='lname']"));
	     ln.sendKeys(Keys.CONTROL+"v");
	     WebElement us=driver.findElement(By.xpath("//input[@id='Username']"));
	     us.sendKeys(Keys.CONTROL+"v");
	     WebElement ps=driver.findElement(By.xpath("//input[@id='password']"));
	     ps.sendKeys(Keys.CONTROL+"v");
	     
	}

}
