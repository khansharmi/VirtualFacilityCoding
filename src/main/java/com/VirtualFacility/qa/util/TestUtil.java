package com.VirtualFacility.qa.util;

import org.openqa.selenium.JavascriptExecutor;

import com.VirtualFacility.qa.base.TestBase;

public class TestUtil extends TestBase{
	public long PAGE_LOAD_TIMEOUT=20;
	public long IMPLICIT_WAIT=20;
	
			


	public void switchToFrame() {
		
		driver.switchTo().frame("mainplanel");
		
	
}
	
	public void scrollDown() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,800)");
	}
	}
