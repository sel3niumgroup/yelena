package com.gurubank;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.DepositPage;

public class Deposit extends Login{
	
	@Test(priority=2)
	public void t002_Deposit()  {
		DashboardPage dashboardPage = new DashboardPage(driver);
		dashboardPage.newCustomerBtn().click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("flow_close_btn_iframe"));
		dashboardPage.closeAdBtn().click();
		driver.switchTo().defaultContent();		
		
		dashboardPage.depositBtn().click();
		
		String cxaccountNo = dataFile("data.json","AmountDepositForm",0, "AccountNo");
		String cxamount = dataFile ("data.json","AmountDepositForm", 0, "Amount");
		String cxdescription = dataFile ("data.json","AmountDepositForm",0, "Description");

		
		DepositPage depositPage = new DepositPage (driver);
		depositPage.accountNo().sendKeys(cxaccountNo); 
		depositPage.amount().sendKeys (cxamount);
		depositPage.description().sendKeys(cxdescription);
		
		depositPage.submit().click();		
	}
	
}