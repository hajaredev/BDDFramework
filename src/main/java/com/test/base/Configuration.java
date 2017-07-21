package com.test.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class Configuration {

	private static Properties prop;
	private static HashMap<String, String> urlMap;

	private static Properties getProp() {

		if (prop == null) {
			prop = new Properties();
			try {

				InputStream input = new FileInputStream(
						new File(
								"C:\\Users\\devrajh\\workspace\\AutomationFramework\\src\\main\\resources\\System.properties"));
				prop.load(input);
			} catch (Exception e) {
				System.out.println("Property not loaded");
			}
		}

		return prop;
	}

	public static final BrowserTypes BROWSER = BrowserTypes.valueOf(getProp()
			.getProperty("selenium.browser"));
	public static final String URL = getProp().getProperty("URL");
	public static final String chromePath = getProp().getProperty("chrome.exe.path");
}
