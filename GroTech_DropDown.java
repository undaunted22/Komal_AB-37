package seleniumProj; //Launch growtechminds registration page and 
//handle drop down print all the option names present in dropdowns 
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroTech_DropDown {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		   driver.get("https://grotechminds.com/registration/");
		   driver.manage().window().maximize();
		   driver.findElement(By.id("myForm")); // not working
		   driver.findElement(By.id("FeMale")); // not working
		   WebElement dr1= driver.findElement(By.id("Skills"));
		  
		   
		   Select s=new Select(dr1);
		   s.selectByValue("select1");
		   List<WebElement> sz=s.getOptions();
		   int count=sz.size();
		   System.out.println(count);
		   String a= dr1.getText();
		   System.out.println(a);
		   
		   WebElement cd=driver.findElement(By.id("Country"));
		   Select s1=new Select(cd);
		   s1.selectByVisibleText("India ");
		   String b=cd.getText();
		   System.out.println(b);
		   WebElement rd=driver.findElement(By.name("Relegion"));
		   Select s2=new Select(rd);
		   s2.selectByValue("Hindu");
		   String c=rd.getText();
		   System.out.println(c);
		   WebElement rbd=driver.findElement(By.id("Agree"));
		   rbd.click();
		   
	}

}
