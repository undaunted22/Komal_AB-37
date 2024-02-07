package seleniumProj;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    FileInputStream f1=new FileInputStream("C:\\Users\\ALSAFA\\selenium\\ExcelSheet\\Komal.xlsx");
    Workbook wb=WorkbookFactory.create(f1);   //create is one of the methods of workbook
    Sheet s1= wb.getSheet("Login");
             Row r1=s1.getRow(1);
           Cell c1=r1.getCell(0);
           String un1=c1.getStringCellValue();
           System.out.println(un1);
               Row r2=s1.getRow(1);
                Cell c2= r2.getCell(1);
                String pwd=c2.getStringCellValue();
                System.out.println(pwd);
                
                
                ChromeDriver driver=new ChromeDriver();
                driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D676742245123%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D3385662371401388272%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9303891%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2367553&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
                 driver.manage().window().maximize();
                 driver.findElement(By.id("ap_email")).sendKeys(un1);
                 driver.findElement(By.id("continue")).click();
                 driver.findElement(By.id("ap_password")).sendKeys(pwd);
                 //driver.findElement(By.id("signInSubmit")).click();
	}

}
