package seleniumProj;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Go_ibibo {
	public static void main(String[] args) throws InterruptedException {
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://www.goibibo.com/flights/air-BLR-DEL-20240206--1-0-0-E-D/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!617695092667!e!goibibo!c!&gad_source=1&gclid=EAIaIQobChMIiMnBidKUhAMVIhCDAx1vBQUPEAAYASAAEgKMa_D_BwE");
     driver.manage().window().maximize();
     //driver.findElement(By.xpath("//input[@class='loginCont__input']"));
     Thread.sleep(4000);
     //WebElement pop_up= driver.findElement(By.id("closeOfferOverlay"));
   //pop_up.click();
   //WebElement from=  driver.findElement(By.xpath("(//p[@class='sc-12foipm-20 bhnHeQ'])[1]"));
     //WebElement rad_btn= driver.findElement(By.xpath("(//label[@class='search-widget-uistyles__RadioLabel-sc-f6e3g4-3 gJqrSF'])[2]"));
     //rad_btn.click();
     WebElement from= driver.findElement(By.xpath("(//input[@class='search-widget-uistyles__SearchInputStyle-sc-f6e3g4-12 gqWtbC'])[1]"));
   Thread.sleep(5000);
   //from.click();
   from.sendKeys("Bangalore");
   Thread.sleep(2000);
   List<WebElement>  auto_sugg=driver.findElements(By.xpath("(//div[@class='search-widget-autosuggeststyles__SuggestEleDesc-sc-d4g22y-7 hryPxR'])[1]"));
   //int count_AutoSugg=results.size();
   //System.out.println(count_AutoSugg);
   WebElement li=driver.findElement(By.xpath("//div[@class='search-widget-autosuggeststyles__SuggestEleDesc-sc-d4g22y-7 hryPxR'][1]"));
   li.click();
   WebElement dest=driver.findElement(By.id("downshift-2-input"));
   dest.sendKeys("Delhi");
   Thread.sleep(2000);
   List<WebElement> auto_sugg1= driver.findElements(By.xpath("(//div[@class='search-widget-autosuggeststyles__SuggstEleContain-sc-d4g22y-3 kVYEyA'])[1]"));
   Thread.sleep(2000);
   WebElement dest1=driver.findElement(By.xpath("(//div[@class='search-widget-autosuggeststyles__SuggstEleHd-sc-d4g22y-4 fBSVbN'])[1]"));
   dest1.click();
   List<WebElement> cal=driver.findElements(By.xpath("(//input[@class='search-widget-uistyles__SearchInputStyle-sc-f6e3g4-12 gqWtbC'])[3]"));
   Thread.sleep(2000);
   WebElement cal_date=driver.findElement(By.id("search-widget-checkin-input"));
   cal_date.click();
   //WebElement date_ret=driver.findElement(By.xpath("(//label[@class='search-widget-uistyles__SearchLabelStyle-sc-f6e3g4-11 hGOeJK'])[5]"));
  WebElement btn=driver.findElement(By.xpath("//button[@class='dweb-commonstyles__ButtonBase-sc-13fxsy5-4 search-widget-uistyles__UpdateSearchBtn-sc-f6e3g4-13 eTrRGk cQWDnK']"));
   btn.click();
   //WebElement ret=driver.findElement(By.xpath("(//input[@class='search-widget-uistyles__SearchInputStyle-sc-f6e3g4-12 gqWtbC'])[4]"));
   //ret.click();
   //WebElement li1=driver.findElement(By.xpath("(//div[@class='search-widget-autosuggeststyles__SuggstEleSubHd-sc-d4g22y-6 iWfBYv'])[1]"));
  // li1.click();
   //int count_sugg=auto_sugg.size();
   //System.out.println(count_sugg);
   //Thread.sleep(2000);
   //from.sendKeys("Bangalore");
	}

}
