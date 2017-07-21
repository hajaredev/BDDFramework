package com.test.pages;

import org.openqa.selenium.By;

import com.test.base.PageBase;

public class LoginPage extends PageBase{
	
	By inputUserName = By.id("");
	By inputPassword = By.id("");
	By buttonLogIn = By.id("");
	
	public void loginToApplication() {
		waitForElement(inputUserName).sendKeys("");
		waitForElement(inputPassword).sendKeys("");
		waitForElement(buttonLogIn).click();
	}
	
}