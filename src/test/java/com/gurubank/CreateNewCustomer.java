package com.gurubank;

import org.apache.commons.lang3.RandomUtils;
import org.testng.annotations.Test;

import pageObjects.CustomerPage;
import pageObjects.DashboardPage;

public class CreateNewCustomer extends Login{
	
	@Test(priority=2)
	public void t002_Create_New_Customer_Account() throws InterruptedException {
		DashboardPage dashboardPage = new DashboardPage(driver);		 
		
		dashboardPage.newCustomerBtn().click();
		String cxName = dataFile("data.json","CustomerDetails",0,"CustomerName");
		String cxGender = dataFile("data.json","CustomerDetails",0,"Gender");
		String[]  dob = dataFile("data.json","CustomerDetails",0,"DateofBirth").split("-");
		
		String  cxAddress = dataFile("data.json","CustomerDetails",0,"Address");
		String  cxCity = dataFile("data.json","CustomerDetails",0,"City");
		String  cxState = dataFile("data.json","CustomerDetails",0,"State");
		String  cxPIN = dataFile("data.json","CustomerDetails",0,"PIN");
		String  cxMobileNumber = dataFile("data.json","CustomerDetails",0,"MobileNumber");
		String  cxEmail = dataFile("data.json","CustomerDetails",0,"E-mail")+RandomUtils.nextInt(10000,99999)+"@gmail.com";
		String  cxPassword = dataFile("data.json","CustomerDetails",0,"Password");
		
		Thread.sleep(3000);
		CustomerPage customerPage = new CustomerPage (driver);
		customerPage.customerName().sendKeys(cxName);
		customerPage.gender(cxGender).click();
		customerPage.enterDOB(dob[2], dob[1], dob[0]);
		customerPage.address().sendKeys (cxAddress);
		customerPage.city().sendKeys (cxCity);
		customerPage.state().sendKeys (cxState);
		customerPage.pin().sendKeys (cxPIN);
		customerPage.mobileNumber().sendKeys(cxMobileNumber);
		customerPage.email().sendKeys(cxEmail);
		customerPage.password().sendKeys (cxPassword);
		customerPage.submit().click();
		Thread.sleep(3000);
	}

}
