package com.VirtualFacility.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VirtualFacility.qa.base.TestBase;

public class LandingPage extends TestBase{
	
	@FindBy(xpath="//strong[text()='BNB']")
	WebElement ETH_BTC;
	
	
		

	public LandingPage(){
		PageFactory.initElements(driver, this);
		
	}
	public PairTradingViewPage ClickEth_BtcLink() {
		ETH_BTC.click();
		
		return new PairTradingViewPage();
	}
}
	