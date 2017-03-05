package com.qa_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlyHomepage {

	WebDriver driver;

	@BeforeTest
	public void Connect(){

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Follow\\Desktop\\Seleniumtools\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://fly.com");
		System.out.println("The title "+ driver.getTitle());
		String path = driver.findElement(By.xpath(".//*[@id='pageHeader']/div/ul[2]/li[2]/a")).getText();
		System.out.println(path);
		Assert.assertEquals("Today's Best deals", "Today's Best deals");
		driver.manage().window().maximize();
	}
	@Test
	public void FillFields(){
		driver.findElement(By.id("from-field")).clear();
		driver.findElement(By.id("from-field")).sendKeys("Philadelphia, PA - Philadelphia Intl (PHL)");
		driver.findElement(By.id("to-field")).sendKeys("Atlanta, GA - Hartsfield-Jackson (ATL)");
		driver.findElement(By.id("date-depart")).sendKeys("03/27/2017");
		driver.findElement(By.id("date-return")).sendKeys("04/05/2017");
		driver.findElement(By.id("search-btn")).click();
	}
	@AfterTest
	public void TearDown() throws InterruptedException{
		driver.wait(20);
		driver.close();
		driver.quit();
	}
}
