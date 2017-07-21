package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.base.PageBase;

public class HomePage extends PageBase {

	By buttonAdd = By.cssSelector("");
	By listAddOptions = By.cssSelector("");

	public HomePage selectAdd() {
		waitForElement(buttonAdd).click();
		return new HomePage();
	}

	public void selectAddOption(String option) {
		for (WebElement element : waitForElements(listAddOptions)) {
			if (element.getText().equalsIgnoreCase(option)) {
				element.click();
				break;
			}
		}
	}
	
	

}
