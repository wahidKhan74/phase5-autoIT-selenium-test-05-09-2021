package com.ecom.webapp;

import org.openqa.selenium.WebDriver;

public class RunTimeDriver {
	
	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		RunTimeDriver.driver = driver;
	}

}
