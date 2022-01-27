package amazoncreateaccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home1 {
	public WebDriver driver;
	@FindBy(id="nav-link-accountList")WebElement sign;
	public home1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void singtoclick() {
		sign.click();
	}
}
