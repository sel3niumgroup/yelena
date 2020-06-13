package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePageObject{
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}


	public WebElement username() {
		By path = By.name("uid");
		return buildElement(path);
	}
	
	
	public WebElement password() {
		By path = By.name("password");
		return buildElement(path);
	}
	

	public WebElement loginBtn() {
		By path = By.name("btnLogin");
		return buildElement(path);
	}
	
	
	
	
	

}
