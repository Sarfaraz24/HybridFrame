package com.w2a.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase {
	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException {
	
		verifyEquals("abc","axyz");
		log.debug("Inside Login test");
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn"))),"Login not successful");
		Thread.sleep(2000);
		log.debug("Login successfully executed");
		Reporter.log("Login sucessfully executed");	
	}
	
}
