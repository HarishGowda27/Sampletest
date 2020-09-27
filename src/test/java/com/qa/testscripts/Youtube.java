package com.qa.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Youtube {
	
	@Test
	  public void youtube() throws Exception {
		  System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Eclipse\\selenium component\\New Automation Jars\\Chrome driver\\New\\chromedriver.exe");
			 
			 WebDriver driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			 driver.manage().window().maximize();
			 driver.get("https://youtube.com/");
			 String url = driver.getCurrentUrl();
		
			 if(url.startsWith("https://youtube.com/"))
			 {
				 System.out.println(url);
			 }
			 else {
				 System.out.println("NO match");
			 }
			 
			 Thread.sleep(5000);
			 driver.quit();
	}
}
