package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePageObject {
	
	public WebDriver driver;

	public BasePageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement buildElement(By by) {
		return driver.findElement(by);
	}

}
