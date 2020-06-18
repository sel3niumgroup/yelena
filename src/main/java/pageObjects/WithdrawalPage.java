package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WithdrawalPage extends BasePageObject{

	public WithdrawalPage(WebDriver driver) {
		super(driver);
	}
		public WebElement accountNo() {
			By path = By.name("accountno");
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
