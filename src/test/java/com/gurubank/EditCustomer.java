package com.gurubank;

import org.testng.annotations.Test;


import pageObjects.DashboardPage;
import pageObjects.EditCustomerPage;

public class EditCustomer  extends Login{

	@Test(priority=2)
	public void t002_EditCustomerForm()  {
		DashboardPage dashboardPage = new DashboardPage(driver);	
		dashboardPage.editCustomerBtn().click();
	
		String cxEditCustomerid = dataFile("data.json","EditCustomerForm",0, "CustomerId");
		
		EditCustomerPage editCustomer = new EditCustomerPage (driver);
		editCustomer.customerId().sendKeys(cxEditCustomerid); 
		
		editCustomer.submit().click();	
	}
}