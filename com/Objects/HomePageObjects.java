package com.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePageObjects {
	public static WebElement appname(WebDriver driver)
	{
	WebElement applicationname=driver.findElement(By.xpath("//a[text()='Travel The World']"));
	return applicationname;
	}
	
	
	public static WebElement HeaderText(WebDriver driver)
	{
	WebElement hdrtxt=driver.findElement(By.xpath("//h1[text()='Welcome to the Simple Travel Agency!']"));
	return hdrtxt;
	}
	
	public static WebElement Traveltheworllink(WebDriver driver)
	{
	WebElement link=driver.findElement(By.xpath("//a[text()='Travel The World']"));
	return link;
	}
	
	public static WebElement homelink(WebDriver driver)
	{
	WebElement link=driver.findElement(By.xpath("//a[text()='home']"));
	return link;
	}
	
	public static WebElement fromCitydropdwon(WebDriver driver)
	{
	WebElement dropdownbutton=driver.findElement(By.name("fromPort"));
	return dropdownbutton;
	}
	
	public static WebElement ToCitydropdwon(WebDriver driver)
	{
	WebElement dropdownbutton=driver.findElement(By.name("toPort"));
	return dropdownbutton;
	}
	
	public static WebElement FindFlightbutton(WebDriver driver)
	{
		//WebElement fbutton=driver.findElement(By.xpath("//input[value()='Find Flights']"));
		WebElement fbutton=driver.findElement(By.xpath("/html/body/div[3]/form/div/input"));
	return fbutton;
	}
	
	
}
