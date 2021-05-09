package com.ecom.webapp;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserProfileUploadTest {
	
	final String profileURL = "https://github.com/settings/profile";
	WebDriver driver;
	
	// setup
	@BeforeEach
	void setUp() {
		InitializeDriver.init();
		driver = RunTimeDriver.getDriver();
	}
	
	@AfterEach
	void tearDown() {
		 // InitializeDriver.destroy();
	}
	
	@Test
	public void testForGithubUserProfileUpload() throws InterruptedException, IOException {
		
		// login 
		LoginToGithub.userLogin();
		
		// navigate useprofile
		driver.get(profileURL);
		
		// click upload profile
		driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[2]/div[2]/div[2]/dl/dd/div/details/summary")).click();
		driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[2]/div[2]/div[2]/dl/dd/div/details/details-menu/label")).click();
		
		Thread.sleep(2000);
		// execute a upload profile.exe file
		Runtime.getRuntime().exec("C:\\Users\\HOME\\Desktop\\AutoIT\\file-upload.exe");
		
		Thread.sleep(2000);
		
		// sumit profile image
		driver.findElement(By.xpath("/html/body/details/details-dialog/form/div[2]/button")).click();
		
		Thread.sleep(2000);
	}
	
	// logincreds
	// profile
	

}
