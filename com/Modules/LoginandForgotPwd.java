package com.Modules;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Objects.HomePageObjects;
import com.Objects.LoginPageObjects;

public class LoginandForgotPwd {

	public  static WebDriver UserLogin(WebDriver driver) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		HomePageObjects.homelink(driver).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "BlazeDemo";
		assertEquals(expectedTitle,actualTitle);
		
		LoginPageObjects.Emailid(driver).sendKeys("Test@gmail.com");
		LoginPageObjects.password(driver).sendKeys("Test1234*");
		LoginPageObjects.Loginbutton(driver).click();
		driver.navigate().back();
		Thread.sleep(5000);
		LoginPageObjects.Emailid(driver).clear();
		driver.navigate().refresh();
		LoginPageObjects.Forgotpasswordlink(driver).click();
		LoginPageObjects.Emailid(driver).sendKeys("Test@gmail.com");
		return driver;
		
	}
}

