package com.ecom.webapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitializeDriver {
	
	final static String driverPath = "driver/chromedriver.exe";
	static WebDriver driver;
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		// set driver instance
		RunTimeDriver.setDriver(driver);
	}
	
	public static void destroy() {
		driver.close();
	}
}
