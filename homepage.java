package WebAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class homepage {
	
	public static WebDriver driver;
	
	public static void main(String [] args) throws InterruptedException {
		
/*	This sets the property of the system to 
		communicate with the gecko driver
		*/
		
		String firefox = System.setProperty("webdriver.gecko.driver", 
				"/Users/Femi/documents/qa_training/geckodriver");
//		WebDriver driver launches firefox
		driver = new FirefoxDriver();
		System.out.println("Browser has been successfully launched");
		driver.get("http://fly.com");
		System.out.println("The title is " + driver.getTitle());
		System.out.println("The current URL is " + driver.getCurrentUrl());
		
/*		finding elements on a web page
 * 1. You can find elements by - ID
 * 2. By CSS
 * 3. By Name
 * 4. By Xpath
 * 5. By LinkText
 * 6. By PartialLinkText
 * 7. By Class
 */
		
		//find element by ID
//		driver.findElement(By.id("tdb1")).click();
		
//		find element by CSS
		driver.findElement(By.cssSelector("input#to-field")).sendKeys("doyindhfbffbfjffjfbjfjbfjb");
		driver.findElement(By.cssSelector("input#to-field")).clear();
		System.out.println("Field cleared");
		
//		find element by name
		driver.findElement(By.name("Destination")).sendKeys("I am going to Boston");
		System.out.println("Destination Boston");
		driver.close();
		driver.quit();
		
		
	}

}

//https://github.com/mozilla/geckodriver. 


