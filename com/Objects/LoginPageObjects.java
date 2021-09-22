package com.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public static WebElement Emailid(WebDriver driver)
	{
	WebElement username=driver.findElement(By.name("email"));
	return username;
	}
	
	public static WebElement password(WebDriver driver)
	{
	WebElement pwd=driver.findElement(By.name("password"));
	return pwd;
	}
	
	public static WebElement Loginbutton(WebDriver driver)
	{
	WebElement Loginbutton=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/form/div[4]/div/button"));
	return Loginbutton;
	}
	
	public static WebElement Forgotpasswordlink(WebDriver driver)
	{
	WebElement link=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/form/div[4]/div/a"));
	return link;
	}
	
	public static WebElement submitforgotpwd(WebDriver driver)
	{
	WebElement submit=driver.findElement(By.linkText("/html/body/div[1]/div/div/div/div/div[2]/form/div[2]/div/button"));
	return submit;
	}
}
