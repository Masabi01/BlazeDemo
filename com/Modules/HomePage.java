package com.Modules;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Objects.*;

public class HomePage {
	
	@Test
	public  static WebDriver HomePageDetails(WebDriver driver) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/index.php");
		HomePageObjects.HeaderText(driver).isDisplayed();
		String actualTitle = driver.getTitle();
		String expectedTitle = "BlazeDemo";
		assertEquals(expectedTitle,actualTitle);
		StringBuffer verificationErrors = new StringBuffer();
		try{
			Assert.assertEquals("Welcome to the Simple Travel Agency!", (HomePageObjects.HeaderText(driver)).getText());
			}
			catch(Error e)
			{
				 verificationErrors.append(e.toString());
			}
		HomePageObjects.Traveltheworllink(driver).isDisplayed();
		//HomePageObjects.homelink(driver);
		return driver;
}
}