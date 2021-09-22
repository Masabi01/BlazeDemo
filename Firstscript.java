

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Firstscript {
	
	@Test
	public  void test()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\I318299\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/index.php");
		driver.findElement(By.xpath("//a[text()='home']")).click();
		driver.findElement(By.linkText("BlazeDemo")).isDisplayed();
		driver.findElement(By.linkText("BlazeDemo")).click();
		//driver.findElement(By.name("fromPort")).click();
		Select objSelect = new Select(driver.findElement(By.name("fromPort")));
		
		
		
		
		driver.quit();
	}

}
