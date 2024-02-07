package seleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_LinkText {

	public static void main(String[] args) {
 ChromeDriver driver=new ChromeDriver();
 driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=13909101923901914806&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9303891&hvtargid=kwd-10573980&hydadcr=14453_2371562");
 driver.findElement(By.linkText("Mobiles")).click();
	}

}
