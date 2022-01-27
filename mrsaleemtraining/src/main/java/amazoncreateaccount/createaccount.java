package amazoncreateaccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createaccount {
public WebDriver driver;
@FindBy(id="createAccountSubmit")WebElement createaccount;
public createaccount(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void createaccountclick() {
	createaccount.click();
}
}
