package com.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectFlightPageObjects {
	
	public static WebElement SelectFlightpagetitle(WebDriver driver)
	{
	WebElement text=driver.findElement(By.xpath("//h1[text()= 'Flights from Portland to Berlin:']"));
	return text;
	}

	public static WebElement ChooseThisbutton(WebDriver driver)
	{
	WebElement button=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input"));
	return button;
	}
	
	public static WebElement DetailsFillupwindowtitle(WebDriver driver)
	{
	WebElement text=driver.findElement(By.xpath("//h2[text()= 'Your flight from TLV to SFO has been reserved.']"));
	return text;
	}
	
	public static WebElement Nametextbox(WebDriver driver)
	{
	WebElement text=driver.findElement(By.id("inputName"));
	return text;
	}
	
	public static WebElement adresstextbox(WebDriver driver)
	{
	WebElement text=driver.findElement(By.id("address"));
	return text;
	}
	
	public static WebElement citytextbox(WebDriver driver)
	{
	WebElement text=driver.findElement(By.id("city"));
	return text;
	}
	
	public static WebElement statetextbox(WebDriver driver)
	{
	WebElement text=driver.findElement(By.id("state"));
	return text;
	}
	
	public static WebElement zipCodetextbox(WebDriver driver)
	{
	WebElement text=driver.findElement(By.id("zipCode"));
	return text;
	}
	
	public static WebElement creditCardNumbertextbox(WebDriver driver)
	{
	WebElement text=driver.findElement(By.id("creditCardNumber"));
	return text;
	}
	
	public static WebElement nameOnCardNumbertextbox(WebDriver driver)
	{
	WebElement text=driver.findElement(By.id("creditCardNumber"));
	return text;
	}
	
	public static WebElement PurchaseFlightbutton(WebDriver driver)
	{
	WebElement text=driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input"));
	return text;
	}
	
	public static WebElement ConfirmationText(WebDriver driver)
	{
	WebElement text=driver.findElement(By.xpath("//h1[text()= 'Thank you for your purchase today!']"));
	return text;
	}
}
