package com.gurubank;



import org.testng.annotations.Test;

import pageObjects.LoginPage;


public class Login extends TestBase{	
	
	
	@Test(priority=1)
	public void t001_loginToApplication() throws InterruptedException {		
		LoginPage loginPage = new LoginPage(driver);
		String username = dataFile("data.json","loginDetails",0,"username");
		String password = dataFile("data.json","loginDetails",0,"password"); 
		
		loginPage.username().sendKeys(username);
		loginPage.password().sendKeys(password);
		loginPage.loginBtn().click();		
	}

}
