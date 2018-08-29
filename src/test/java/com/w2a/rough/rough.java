package com.w2a.rough;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class rough {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		verifyEquals("sa", "sasa");	
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/manager");
		driver.findElement(By.cssSelector("button[ng-click='addCust()']")).click();
	
	}
	
	public static void verifyEquals(String expected, String actual) throws IOException {
		try {
			Assert.assertEquals(actual, expected);
			} 
			catch (Exception t) {
				System.out.println(t);
			}
			}
}
