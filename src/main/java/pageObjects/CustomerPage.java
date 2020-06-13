package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CustomerPage extends BasePageObject{

	public CustomerPage(WebDriver driver) {
		super(driver);
	}

	public WebElement customerName() {
		By path = By.name("name");
		return buildElement(path);
	}
	
	public WebElement gender(String gender) {
		By path = By.xpath(String.format("//input[@value='%s']",gender));
		return buildElement(path);
	}
	
	public WebElement dateOfBirth() {
		By path = By.name("dob");
		return buildElement(path);
	}
	
	public WebElement address() {
		By path = By.name("addr");
		return buildElement(path);
	}
	
	public WebElement city() {
		By path = By.name("city");
		return buildElement(path);
	}
	
	public WebElement  state() {
		By path = By.name("state");
		return buildElement(path);
	}
	
	public WebElement pin() {
		By path = By.name("pinno");
		return buildElement(path);
	}
	
	public WebElement mobileNumber() {
		By path = By.name("telephoneno");
		return buildElement(path);
	}
	
	public WebElement email() {
		By path = By.name("emailid");
		return buildElement(path);
	}
	
	public WebElement password() {
		By path = By.name("password");
		return buildElement(path);
	}
	
	public WebElement submit() {
		By path = By.name("sub");
		return buildElement(path);
	}	
	
	public void enterDOB(String year, String month, String day) {
		this.dateOfBirth().clear();
		this.dateOfBirth().sendKeys(year);
		this.dateOfBirth().sendKeys(Keys.TAB);
		this.dateOfBirth().sendKeys(month);
		this.dateOfBirth().sendKeys(day);		
	}
	
}
	