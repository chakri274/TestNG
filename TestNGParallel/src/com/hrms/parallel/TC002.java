package com.hrms.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC002 {
	
	WebDriver driver;
	@Test
	public void openChrome() throws Exception {
		
		driver.navigate().to("www.google.com");
		Reporter.log("Google OPENED");
		Thread.sleep(4000);
		
		}
	@Parameters({"browser"})
	@BeforeMethod
	public void setUP(String browser) {
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\\\Softwares\\\\Drivers\\\\geckodriver-v0.30.0-win64\\\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(browser.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
		
	}
	@AfterMethod
	public void closeFF() {
		driver.close();
	}


	}


