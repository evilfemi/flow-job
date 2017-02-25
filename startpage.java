package WebAppTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartPage {
	
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
		driver.get("http://107.170.213.234/catalog/index.php");
		System.out.println("The title is " + driver.getTitle());
		System.out.println("The current URL is " + driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}

//https://github.com/mozilla/geckodriver. 


