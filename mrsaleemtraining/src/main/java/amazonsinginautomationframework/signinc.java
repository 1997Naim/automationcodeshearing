package amazonsinginautomationframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinc {
public WebDriver driver;
@FindBy(name = "email")WebElement email;
@FindBy(id = "continue")WebElement Continue;
@FindBy(xpath = "//*[contains(text(),'We cannot find an account with that email address')]")WebElement error;
@FindBy(xpath = "//*[contains(text(),'Email or mobile phone number')]")WebElement emailandphone;
public  signinc(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void Emailsendkey() {
	email.sendKeys("naimchowdhury.nc@gmail.com");
}
public void Continuebc() {
	Continue.click();
}
public String text() {
String errorof=	error.getText();
return errorof;
	
}
public String emailtext() {
	String emailt= emailandphone.getText();
	return emailt;
}
public void emailsendkey1() {
	email.sendKeys("naimchowdhury.office@gmail.com");
}


}
