package com.Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Modules.BookFlight;
import com.Modules.HomePage;
import com.Modules.LoginandForgotPwd;




@Test
public class Testcases {
	
		public WebDriver driver;
		
		//@BeforeClass
//		  @Parameters("browser")
		 
//		  public void beforeTest(String browser) throws MalformedURLException {
//			if (browser.equalsIgnoreCase("chrome")) 
//			{
		      //  WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\I318299\\Documents\\Selenium\\chromedriver.exe");
			//	 driver = new ChromeDriver();
//			}
//		}
		
		@Test(priority=0)
		public  void HomePageTestcase() throws InterruptedException
		
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\I318299\\Documents\\Selenium\\chromedriver.exe");
			 driver = new ChromeDriver();
			
			 HomePage.HomePageDetails(driver);
			//return driver;
		}
		
		@Test(priority=1)
		
		public  void BookFlightTestcase() throws InterruptedException
		{
			BookFlight.BookaFlight(driver);
		}
		
	@Test(priority=2)
		
		public  void LoginandForgotpasswordlink() throws InterruptedException
		{
			LoginandForgotPwd.UserLogin(driver);
			driver.close();
			driver.quit();
		}
	}
