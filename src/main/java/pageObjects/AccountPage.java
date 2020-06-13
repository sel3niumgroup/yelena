package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage extends BasePageObject{
	
	public AccountPage(WebDriver driver) {
		super(driver);
	}

    public WebElement customerId() {
		By path = By.name("cusid");
		return buildElement(path);
	}	

	public WebElement accountType() {
		By path = By.name("selaccount");
		return buildElement(path);
	}
	
	public WebElement initialDeposit() {
		By path = By.name("inideposit");
		return buildElement(path);
	}

	public WebElement submit() {
		By path = By.name("button2");
		return buildElement(path);
	}	

}
