package package_DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiscellaneousDataProvider {
	@Test(dataProvider = "LoginCreds")
	public void AmznCreds(String un, String pwd) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement mob_no = driver.findElement(By.id("ap_email"));
		mob_no.sendKeys(un);
		driver.findElement(By.id("continue")).click();
		WebElement pswrd = driver.findElement(By.id("ap_password"));
		pswrd.sendKeys(pwd);
		driver.findElement(By.id("signInSubmit")).click();
		driver.close();
	}

	@Test(dataProvider = "LoginCreds")
	public void GitCreds(String un, String pwd) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("login_field")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.name("commit")).click();
		driver.close();

	}

	public void GRMCreds(String un, String pwd) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/user-account/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("user_login")).sendKeys(un);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.xpath("//span[.='Sign In']")).click();
		driver.close();

	}

	@DataProvider(name = "LoginCreds")
	public Object[][] data_for_LoginCreds() {
		Object a[][] = new Object[4][2];
		a[0][0] = "7976169393";
		a[0][1] = "ADRHp@s$123";
		a[1][0] = "komalrautela@gmail.com";
		a[1][1] = "MyGIT@1289";
		a[2][0] = "komalrautel@gmail.com";
		a[2][1] = "QWRT!234@";

		return a;

	}

}