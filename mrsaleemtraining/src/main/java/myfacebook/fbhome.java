package myfacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbhome {
	public WebDriver driver;
	@FindBy(linkText = "Create new account") WebElement createaccount;
	public fbhome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	public void createacclick() {
		createaccount.click();
	}
}