package amazonTestNG_TC;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_Quit {
	
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void launch(String name_of_browser)
	{
		if(name_of_browser.equals("chrome")) 
		{
			driver=new ChromeDriver();
		}
		if(name_of_browser.equals("edge")) 
		{
			driver=new EdgeDriver();
		}
		if(name_of_browser.equals("firefox")) 
		{
			driver=new FirefoxDriver();
		}
	/*	if(name_of_browser.equals("opera")) 
		{
			driver=new OperaDriver();
		}
	*/
	
	
	
		  //driver=new EdgeDriver();
	      driver.get("https://www.amazon.in");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	@AfterMethod
	public void quit() 
	{
		driver.close();
	}

}
