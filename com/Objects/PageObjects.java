package com.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects {
	public static WebElement getUsernameField(WebDriver driver)
	{
	WebElement username=driver.findElement(By.name("username"));

	return username;
	}
}
