package amazoncreateaccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	public WebDriver driver;
	@FindBy(linkText = "My Account")WebElement account;
	@FindBy(linkText = " Sign in ")WebElement signin;
	public homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void myaclick() {
Actions obj= new Actions (driver);
obj.moveToElement(account).click().build().perform();
		
	}

}
