package com.sel2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest2 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http:\\www.google.co.in");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\A STUFF\\SOFTWARE\\selenium\\chromedriver.exe");
	  driver =  new ChromeDriver();
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

}
