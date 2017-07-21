package com.test.pages;

import org.openqa.selenium.By;

import com.test.base.PageBase;

public class ClientTypePage extends PageBase {
	By buttonNext = By.cssSelector("");

	public void navigateToNextPage() {
		waitForElement(buttonNext).click();
	}
}
