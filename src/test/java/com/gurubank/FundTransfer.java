package com.gurubank;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.FundTransferPage;

public class FundTransfer extends Login {

	@Test(priority = 2)
	public void t002_FundTransfer() throws InterruptedException {
		DashboardPage dashboardPage = new DashboardPage(driver);
		Thread.sleep(3000);
		dashboardPage.newCustomerBtn().click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("flow_close_btn_iframe"));
		dashboardPage.closeAdBtn().click();
		driver.switchTo().defaultContent();

		dashboardPage.fundTransferlBtn().click();

		String cxpayersaccountNo = dataFile("data.json", "FundTransfer", 0, "PayersAccountNo");
		String cxpayeesaccountNo = dataFile("data.json", "FundTransfer", 0, "PayeesAccountNo");
		String cxamount = dataFile("data.json", "FundTransfer", 0, "Amount");
		String cxdescription = dataFile("data.json", "FundTransfer", 0, "Description");

		FundTransferPage fundTransferPage = new FundTransferPage(driver);
		fundTransferPage.payersaccountNo().sendKeys(cxpayersaccountNo);
		fundTransferPage.payeesaccountNo().sendKeys(cxpayeesaccountNo);
		fundTransferPage.amount().sendKeys(cxamount);
		fundTransferPage.description().sendKeys(cxdescription);

		fundTransferPage.submit().click();
	}
}
