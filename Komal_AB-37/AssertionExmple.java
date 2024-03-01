package assertion_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExmple 
{
	@Test
	public void meth1() {
    EdgeDriver driver=new EdgeDriver();
    driver.get("https://testautomationpractice.blogspot.com/");
	String expectedTitle="Automation Testing Practice";
	String actualTitle=driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle, "Verifying the Title of the Page");
	
	WebElement icon=driver.findElement(By.className("wikipedia-icon"));
	Assert.assertTrue(icon.isDisplayed());  //
	
	WebElement btn=driver.findElement(By.className("wikipedia-search-button"));
	Assert.assertTrue(btn.isDisplayed());
	
	WebElement clck_btn=driver.findElement(By.xpath("//button[.='New Browser Window']"));
	Assert.assertFalse(clck_btn.isDisplayed()==false);  //this will fail the TC.
	
	WebElement CpyTxt_bt=driver.findElement(By.xpath("//button[.='Copy Text']"));
	Assert.assertEquals(CpyTxt_bt.isDisplayed()==true, false);
	
	//WebElement CpyTxt_bt1=driver.findElement(By.xpath("//button[.='Copy Text']"));
	 
	
	
}
	
	
	
	
	
	
	}

