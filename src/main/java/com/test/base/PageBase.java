package com.test.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageBase extends WebDriverBase {

	public void launchApplication() {
		getDriverInstance().get(Configuration.URL);
	}

	public void waitForPagetoLoad(int timeOut) {
		if (timeOut > 0) {
			getDriverInstance().manage().timeouts()
					.pageLoadTimeout(timeOut, TimeUnit.SECONDS);
		}
	}

	public boolean hasElement(By by) {
		return countElements(by) != 0;
	}

	public int countElements(By by) {
		return 0;

	}

	public WebElement waitForElement(By by) {
		WebElement element = null;
		try {
			element = getDriverInstance().findElement(by);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}
	
	public List<WebElement> waitForElements(By by) {
		List<WebElement> elements = null;
		try {
			elements = getDriverInstance().findElements(by);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return elements;
	}
	
	public void selectOptionByValue(WebElement element, String option) {
		Select select = new Select(element);
		select.selectByValue(option);
	} 
	
}
