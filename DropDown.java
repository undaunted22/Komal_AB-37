package seleniumProj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
	     driver.get("https://www.amazon.in/");
	     driver.manage().window().maximize();
	     WebElement cate_dd=driver.findElement(By.id("searchDropdownBox")); //return type of find element is web element
	     
	    Select s1=new Select(cate_dd);
	    //s1.selectByValue("search-alias=furniture"); //selected by value
	    s1.selectByVisibleText("Books");
	     
	}
	
}


//id("searchDropdownBox")