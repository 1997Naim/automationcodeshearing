package myfb;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commoncodes.utility;
import myfacebook.homeoffb;

public class findelement extends utility{
  @Test
  public void f() {
	  List<WebElement> ti = driver.findElements(By.tagName("a"));
	  System.out.println(ti.size());
	  for( WebElement tx:ti) {
	  System.out.println(tx.getText());
  }
}
  @Test
  public void PropertiesOfMethod() throws InterruptedException, IOException {
	  String local= System.getProperty("user.dir");
	  Properties pro = new Properties();
	  FileInputStream sd = new FileInputStream(local+"\\target\\regrassion.properties");
	  pro.load(sd);
	  String email =pro.getProperty("Email");
	  String Psswd = pro.getProperty("Password");
	  homeoffb home=new homeoffb(driver);
	  home.emailsend(email);
	  Thread.sleep(1000);
	  home.passsend(Psswd);
	  Thread.sleep(1000);
	  home.logbc();
	  Thread.sleep(1000);
	  }
  //@Test
  public void Excelsheetdata() {
	  XSSFWorkbook ExcelWbook;
	  XSSFSheet ExcelWsheet;
	  XSSFCell Cell;
	  String path= "C:\\Users\\naimu\\git\\repository\\mrsaleemtraining\\mr ankur class 1.xlsx";
	  String sheetname="bike";
	  try {
		FileInputStream ExcelFile = new FileInputStream(path);
		ExcelWbook= new XSSFWorkbook(ExcelFile); 
		ExcelWsheet = ExcelWbook.getSheet(sheetname);
		Cell= ExcelWsheet.getRow(0).getCell(0);
		String cellData=Cell.getStringCellValue();
		System.out.println("cell Data"+cellData);
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  
  }



















}