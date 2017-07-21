package com.test.base;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public abstract class WebDriverBase {

	private static HashMap<Long, WebDriver> map = new HashMap<Long, WebDriver>();

	public static WebDriver getDriverInstance() {
		WebDriver toReturn = map.get(Thread.currentThread().getId());
		if (toReturn == null) {
			loadWebDriver();
		}
		return map.get(Thread.currentThread().getId());
	}

	private static void loadWebDriver() {
		BrowserTypes browserType = Configuration.BROWSER;
		WebDriver webDriver = null;

		try {
			DesiredCapabilities capabilities;
			switch (browserType) {
			case IE:
				break;

			case FIREFOX:
				ProfilesIni profilesIni = new ProfilesIni();
				FirefoxProfile firefoxProfile = profilesIni
						.getProfile("default");
				capabilities = DesiredCapabilities.firefox();
				capabilities.setBrowserName("firefox");
				webDriver = new FirefoxDriver(firefoxProfile);
				break;

			case CHROME:
				System.setProperty("webdriver.chrome.driver", Configuration.chromePath);
				webDriver = new ChromeDriver();
				break;

			default:
				throw new RuntimeException("Browser type not supported");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		webDriver.manage().window().maximize();
		webDriver.manage().timeouts()
				.implicitlyWait(5000, TimeUnit.MILLISECONDS);
		webDriver.manage().deleteAllCookies();

		map.put(Thread.currentThread().getId(), webDriver);

	}

}
