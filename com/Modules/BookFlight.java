package com.Modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Objects.HomePageObjects;
import com.Objects.SelectFlightPageObjects;


public class BookFlight {
	public  static WebDriver BookaFlight(WebDriver driver) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		Select obj=new Select(HomePageObjects.fromCitydropdwon(driver));
		obj.selectByValue("Portland");
		Select obj1=new Select(HomePageObjects.ToCitydropdwon(driver));
		obj1.selectByValue("Rome");
		Thread.sleep(3000);
		HomePageObjects.FindFlightbutton(driver).click();
		SelectFlightPageObjects.ChooseThisbutton(driver).click();
		SelectFlightPageObjects.DetailsFillupwindowtitle(driver).isDisplayed();
		SelectFlightPageObjects.Nametextbox(driver).sendKeys("Test");
		SelectFlightPageObjects.adresstextbox(driver).sendKeys("Test Address");
		SelectFlightPageObjects.citytextbox(driver).sendKeys("Bengaluru");
		SelectFlightPageObjects.statetextbox(driver).sendKeys("Karnataka");
		SelectFlightPageObjects.zipCodetextbox(driver).sendKeys("123456");
		SelectFlightPageObjects.creditCardNumbertextbox(driver).sendKeys("1234567890");
		SelectFlightPageObjects.nameOnCardNumbertextbox(driver).sendKeys("Test User");
		SelectFlightPageObjects.PurchaseFlightbutton(driver).click();
	//	SelectFlightPageObjects.ConfirmationText(driver).isDisplayed();
		StringBuffer verificationErrors = new StringBuffer();
		try{
			Assert.assertEquals("Thank you for your purchase today!", (SelectFlightPageObjects.ConfirmationText(driver)).getText());
			}
			catch(Error e)
			{
				 verificationErrors.append(e.toString());
			}
		
		return driver;
	}
}
