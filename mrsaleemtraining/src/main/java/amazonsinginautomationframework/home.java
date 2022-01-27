package amazonsinginautomationframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	public WebDriver driver;
@FindBy(id="nav-link-accountList")WebElement sign;
public home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void singtoclick() {
	sign.click();
}
}
