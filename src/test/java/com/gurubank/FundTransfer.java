package com.gurubank;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.FundTransferPage;

public class FundTransfer extends Login {

	@Test(priority = 2)
	public void t002_FundTransfer() throws InterruptedException {
		DashboardPage dashboardPage = new DashboardPage(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.newCustomerBtn()));
		dashboardPage.newCustomerBtn().click();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("flow_close_btn_iframe"));
		dashboardPage.closeAdBtn().click();
		driver.switchTo().defaultContent();

		dashboardPage.fundTransferlBtn().click();

		String cxPayersAccountNo = dataFile("data.json", "FundTransfer", 0, "PayersAccountNo");
		String cxPayeesAccountNo = dataFile("data.json", "FundTransfer", 0, "PayeesAccountNo");
		String cxAmount = dataFile("data.json", "FundTransfer", 0, "Amount");
		String cxDescription = dataFile("data.json", "FundTransfer", 0, "Description");

		FundTransferPage fundTransferPage = new FundTransferPage(driver);
		fundTransferPage.payersaccountNo().sendKeys(cxPayersAccountNo);
		fundTransferPage.payeesaccountNo().sendKeys(cxPayeesAccountNo);
		fundTransferPage.amount().sendKeys(cxAmount);
		fundTransferPage.description().sendKeys(cxDescription);
		fundTransferPage.submit().click();	
		
		Assert.assertEquals(fundTransferPage.continueBtn().isDisplayed(), true);	
	}
}
