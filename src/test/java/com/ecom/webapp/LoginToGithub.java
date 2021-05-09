package com.ecom.webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginToGithub {

	public static void userLogin() {
		
		WebDriver driver = RunTimeDriver.getDriver();
		final String siteURL = "https://github.com/login";		
		driver.get(siteURL);
		
		driver.findElement(By.id("login_field")).sendKeys(LoginCreds.username);
		driver.findElement(By.id("password")).sendKeys(LoginCreds.password);
		
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[12]")).submit();
	}
}
