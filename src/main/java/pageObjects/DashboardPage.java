package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePageObject{
	
	public DashboardPage(WebDriver driver) {
		super(driver);
	}

	public WebElement newCustomerBtn() {
		By path = By.linkText("New Customer");
		return buildElement(path);
	}
	
	public WebElement newAccountBtn() {
		By path = By.linkText("New Account");
		return buildElement(path);
	}
	
	public WebElement editCustomerBtn() {
		By path = By.linkText("Edit Customer");
		return buildElement(path);
		
	}
	
	public WebElement editAccountBtn() {
		By path = By.linkText("Edit Account");
		return buildElement(path);
	}
	public WebElement depositBtn() {
		By path = By.xpath("//a[text()='Deposit']/..");
		return buildElement(path);

	}
	
	public WebElement iframe() {
		By path = By.id("flow_close_btn_iframe");
		return buildElement(path);
	}
	
	public WebElement closeAdBtn() {
		By path = By.id("closeBtn");
		return buildElement(path);
	} 

}