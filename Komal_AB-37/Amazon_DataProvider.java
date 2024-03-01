package package_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazon_DataProvider 
{
  @Test(dataProvider="LoginCreds")
  public void Creds(String un, String pwd) {
	  EdgeDriver driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	  driver.findElement(By.id("ap_email")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.id("signInSubmit")).click();
	  driver.quit();
  }
	
	@DataProvider(name="LoginCreds")
  public Object[][]
		  data_for_amazonlogin()
		  {
	         Object a[][]=new Object[7][2];
	         a[0][0]="7976169393";
	         a[0][1]="PeRp@s$1267"; //rght un right pwd
	         
	         a[1][0]="7976169393";	
	         a[1][1]="ReRp@s$3521"; //rght un wrong pwd
	         
	         a[2][0]="7976169389";
	         a[2][1]="DeRp@s$123";  //wrng un rght pwd
	         
	         a[3][0]="7976169380";
	         a[3][1]="AeRp@s$100";  //wrng un wrng pwd
	         
	         a[4][0]=" ";
	         a[4][1]="abcd@9876"; //blnk un any pwd
	         
	         a[5][0]="7976169393";
	         a[5][1]=" ";          //rght un blnk pwd
	         
	         a[6][0]=" ";   
	         a[6][1]=" ";            //blnk un blnk pwd
	         
			return a;
	        		
		  }
}
