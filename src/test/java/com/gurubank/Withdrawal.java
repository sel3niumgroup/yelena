package com.gurubank;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.WithdrawalPage;

public class Withdrawal extends Login {
	@Test(priority = 2)
	public void t002_Withdrawal() {
		DashboardPage dashboardPage = new DashboardPage(driver);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.newCustomerBtn()));
		dashboardPage.newCustomerBtn().click();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("flow_close_btn_iframe"));
		dashboardPage.closeAdBtn().click();
		driver.switchTo().defaultContent();

		dashboardPage.withdrawalBtn().click();

		String cxaccountNoWithdrawal = dataFile("data.json", "AmountWithdrawalForm", 0, "AccountNo");
		String cxamountWithdrawal = dataFile("data.json", "AmountWithdrawalForm", 0, "Amount");
		String cxdescriptionWithdrawal = dataFile("data.json", "AmountWithdrawalForm", 0, "Description");

		WithdrawalPage withdrawalPage = new WithdrawalPage(driver);
		withdrawalPage.accountNo().sendKeys(cxaccountNoWithdrawal);
		withdrawalPage.amount().sendKeys(cxamountWithdrawal);
		withdrawalPage.description().sendKeys(cxdescriptionWithdrawal);

		withdrawalPage.submit().click();
	}
}
