package com.VirtualFacility.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.VirtualFacility.qa.base.TestBase;
import com.VirtualFacility.qa.pages.LandingPage;
import com.VirtualFacility.qa.pages.PairTradingViewPage;
import com.VirtualFacility.qa.util.TestUtil;

public class LandingPageTest extends TestBase{
	
	LandingPage landingPage;
	PairTradingViewPage pairTradingViewPage;
	TestUtil testUtil;
	
	public LandingPageTest() {
		
		super();
	}
	
	@BeforeMethod
	
	public void setUp() {
		initialization();
		
		landingPage=new LandingPage();
		testUtil=new TestUtil();
	}
	
	@Test(priority=1)

	public void ClickEth_BtcLinkTest(){
		testUtil.scrollDown();
		pairTradingViewPage=landingPage.ClickEth_BtcLink();
	
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	 }
	

}
