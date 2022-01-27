package myfacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homeoffb {
	public WebDriver driver;

@FindBy(name="email") WebElement email;
@FindBy (name  = "pass")WebElement pass;
@FindBy(name  = "login") WebElement logb;
public homeoffb(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void  emailsend(String emails) {
	email.sendKeys(emails);
}
public void passsend(String password) {
	pass.sendKeys(password);
}
public void logbc() {
	logb.click();
}


}
