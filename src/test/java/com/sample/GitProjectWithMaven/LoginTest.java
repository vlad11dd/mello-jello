package com.sample.GitProjectWithMaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LoginTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM JARS And Utility Files And Drivers\\Selenium_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	
	@Test
	public void doLogin(){
		
		System.out.println("Executing Login Test");
		driver.get ("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//* [@id='email']")).sendKeys("vairajapu@gmail.com");
		driver.findElement(By.xpath(".//* [@id='pass']")).sendKeys("vai 2017raj");
		driver.findElement(By.name("login")).click();
		System.out.println("Loginning into facebook account");
		
	}
	@AfterTest 
	public void QuitDriver()
	{ if (driver!=null)
		driver.close();
	}
}
