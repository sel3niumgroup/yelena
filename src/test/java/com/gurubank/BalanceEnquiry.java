package com.gurubank;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.BalanceEnquiryPage;
import pageObjects.DashboardPage;

public class BalanceEnquiry extends Login {

	@Test(priority = 2)
	public void t002_BalanceEnquiry() throws InterruptedException {
		DashboardPage dashboardPage = new DashboardPage(driver);
		Thread.sleep(3000);
		dashboardPage.newCustomerBtn().click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("flow_close_btn_iframe"));
		dashboardPage.closeAdBtn().click();
		driver.switchTo().defaultContent();

		dashboardPage.balanceEnquirylBtn().click();

		String cxaccount = dataFile("data.json", "BalanceEnquiryForm", 0, "AccountNo");
		
		BalanceEnquiryPage balanceEnquiryPage = new BalanceEnquiryPage(driver);
		balanceEnquiryPage.accountNo().sendKeys(cxaccount);
			
		balanceEnquiryPage.submit().click();
	}
}
