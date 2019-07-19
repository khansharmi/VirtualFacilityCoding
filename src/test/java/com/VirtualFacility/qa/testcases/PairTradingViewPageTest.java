package com.VirtualFacility.qa.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.VirtualFacility.qa.base.TestBase;
import com.VirtualFacility.qa.pages.LandingPage;
import com.VirtualFacility.qa.pages.PairTradingViewPage;

public class PairTradingViewPageTest extends TestBase{
	
	
	LandingPage landingPage;
	PairTradingViewPage pairTradingViewPage;
	
	public PairTradingViewPageTest() {
		super();
		
	}

	
	@BeforeMethod
	
	public void setUp() {
		initialization();
		
		landingPage=new LandingPage();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,800)");
	
		pairTradingViewPage=landingPage.ClickEth_BtcLink();
	}

	@Test
	public void verifyTradingChartTest() {
		pairTradingViewPage.verifyChart();
	}
	
	@Test
	public void verifyLimitBtnTest() {
		pairTradingViewPage.verifyLimitButton();
	
	}
	
	
	@Test
	public void inputLimitAmountTest() {
		pairTradingViewPage.inputLimitAmount(200);// real life we must not use hard coded value
		
	}
	
	
	@Test
	public void verifyMarketBtnTest() {
		pairTradingViewPage.marketBtn();
		
	}
	@Test
	public void stopLimitBtnTest() {
		pairTradingViewPage.stopLimitButton();
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();



	}
}



