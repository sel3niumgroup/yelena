package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditCustomerPage extends BasePageObject {

	public EditCustomerPage(WebDriver driver) {
		super(driver);			
	}

	public WebElement customerId() {
		By path = By.name("cusid");
		return buildElement(path);
	}
	
	public WebElement submit() {
		By path = By.name("AccSubmit");
		return buildElement(path);
	}
}
