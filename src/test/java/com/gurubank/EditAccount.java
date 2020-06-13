package com.gurubank;

import org.testng.annotations.Test;


import pageObjects.DashboardPage;
import pageObjects.EditAccountPage;

public class EditAccount extends Login{
	@Test(priority=2)
	public void t002_EditAccountForm()  {
		DashboardPage dashboardPage = new DashboardPage(driver);	
		dashboardPage.editAccountBtn().click();
	
		String cxEditAccountNo = dataFile("data.json","EditAccountForm",0, "AccountNo");
		
		EditAccountPage editAccount = new EditAccountPage (driver);
		editAccount.accountNo().sendKeys(cxEditAccountNo); 
		
		editAccount.submit().click();
}
}