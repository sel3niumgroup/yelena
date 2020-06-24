package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BalanceEnquiryPage extends BasePageObject  {

	public BalanceEnquiryPage(WebDriver driver) {
		super(driver);
	}
		public WebElement accountNo() {
			By path = By.name("accountno");
			return buildElement(path);
		}

		public WebElement submit() {
			By path = By.name("AccSubmit");
			return buildElement(path);
 }
}