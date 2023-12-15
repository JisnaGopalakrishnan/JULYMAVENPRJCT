package test;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Sauselogin;

public class Souselogintest {
WebDriver d;
@BeforeTest
public void setup()
{
d=new ChromeDriver();
d.get("https://www.saucedemo.com");
}
@Test


public void login() throws Exception {
    Sauselogin ob = new Sauselogin(d);
    FileInputStream ob1 = new FileInputStream("C:/Users/91812/Desktop/Book2.xlsx");
    XSSFWorkbook wb = new XSSFWorkbook(ob1);
    XSSFSheet sh = wb.getSheet("sheet1");
    int row = sh.getLastRowNum();

    for (int i = 1; i <= row; i++) {
        String username = sh.getRow(i).getCell(0).getStringCellValue();
        System.out.println("username= " + username);
        String pswd = sh.getRow(i).getCell(1).getStringCellValue();
        System.out.println("Pswd= " + pswd);

        d.navigate().refresh();
        
        ob.setvalues(username, pswd);
        ob.login();

        String expectedurl = "https://www.saucedemo.com/inventory.html";
        String actualurl = d.getCurrentUrl();

        if (actualurl.equals(expectedurl)) {
            System.out.println("Login successful");
            ob.addtocart();
            ob.checkout();
        } else {
            System.out.println("Login failed");
        }
    }
}
}

