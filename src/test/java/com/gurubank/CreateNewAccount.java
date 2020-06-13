package com.gurubank;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.DashboardPage;

public class CreateNewAccount extends Login{
	
	@Test(priority=2)
	public void t002_Add_New_Account()  {
		DashboardPage dashboardPage = new DashboardPage(driver);	
		dashboardPage.newAccountBtn().click();
		
		String cxCustomerid = dataFile("data.json","AddNewAccountForm",0, "CustomerId");
		String cxAccountType = dataFile ("data.json","AddNewAccountForm",0, "AccountType");
		String cxinitialDeposit = dataFile ("data.json","AddNewAccountForm",0, "InitialDeposit");

		AccountPage accountForm = new AccountPage (driver);
		accountForm.customerId().sendKeys(cxCustomerid);    
		Select accType = new Select(accountForm.accountType());
		accType.selectByValue(cxAccountType);
		
		accountForm.initialDeposit().sendKeys (cxinitialDeposit);
		accountForm.submit().click();		
	}
	
	

}
