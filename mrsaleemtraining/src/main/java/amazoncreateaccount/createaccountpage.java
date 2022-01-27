package amazoncreateaccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createaccountpage {
public WebDriver driver;
@FindBy(id="ap_customer_name")WebElement customername;
@FindBy(id="ap_email")WebElement customeremail;
@FindBy(id="ap_password")WebElement password;
@FindBy(id="ap_password_check")WebElement reenterpassword;
@FindBy(id="continue")WebElement Continue;
public createaccountpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void namesendkey() {
	customername.sendKeys("naim chowdhury");
}
public void emailidsendkey() {
	customeremail.sendKeys("naimchowdhury.nc@gmail.com");
}
public void passwordsendkey() {
	password.sendKeys("1234Naim@@");
}
public void reenterpasswordkey() {
	reenterpassword.sendKeys("1234Naim@@");
}
public void continuebuttonclick() {
	Continue.click();
}










}
