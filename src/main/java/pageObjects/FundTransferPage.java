package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FundTransferPage extends BasePageObject {

	public FundTransferPage(WebDriver driver) {
		super(driver);
	}
		public WebElement payersaccountNo() {
			By path = By.name("payersaccount");
			return buildElement(path);
		}
		public WebElement payeesaccountNo() {
			By path = By.name("payeeaccount");
			return buildElement(path);
		}
		public WebElement amount() {
				By path = By.name("ammount");
				return buildElement(path);
		}
		public WebElement description() {
			By path = By.name("desc");
			return buildElement(path);
		}
		public WebElement submit() {
			By path = By.name("AccSubmit");
			return buildElement(path);
		
	}

}
