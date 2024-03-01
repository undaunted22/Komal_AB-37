package package_one;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Testing 
{
	WebDriver driver;
  @Test
  @Parameters("browser")
  public void Launching_browser(String name_of_browser)
  {
	  if(name_of_browser.equals("chrome")) 
	  {
		  driver=new ChromeDriver();  
	  }
	  if(name_of_browser.equals("firefox")) 
	  {
	    driver=new FirefoxDriver();
      }
	  if(name_of_browser.equals("edge"))
	  {
		  driver=new EdgeDriver();
	  }
	  if(name_of_browser.equals("ie"))
	  {
		  driver=new InternetExplorerDriver();
	  }
	  driver.get("https://www.google.com");
	  //driver.manage().window().maximize();
	  WebElement elmnt=driver.findElement(By.name("q"));
	  elmnt.sendKeys("India");
	  elmnt.sendKeys(Keys.ENTER);
	  
}
}