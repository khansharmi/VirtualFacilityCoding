package com.VirtualFacility.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VirtualFacility.qa.base.TestBase;

public class PairTradingViewPage extends TestBase{
	
	@FindBy (xpath="//div[@class='chartContainer hy0q36-0 faSQzH']")
	WebElement tradingchart;
	
	
	@FindBy(xpath="//li[@class='sc-1n3jmzh-5 fqgSIh']")
	WebElement limitBtn;
	
	@FindBy (xpath="//input[@id='FormRow-BUY-quantity']")
	WebElement limitAmountForLimit;
	
	
	@FindBy (xpath="//a[@id='TabbedOrderFormsMargin-a-exchangeMarket']")
	WebElement marketBtn;
	
	@FindBy (xpath="//input[@id='FormRow-BUY-quantity']")
	WebElement mktAmount;
	
	
	@FindBy(xpath="//span[contains(text(),'Stop-limit')]")
	WebElement stopLimitBtn;
	
	
	@FindBy (xpath="//input[@id='FormRow-BUY-stopPrice']")
	WebElement Stopfeild;
	
	
	@FindBy (xpath="//input[@id='FormRow-BUY-stopLimitPrice']")
	WebElement stopLimitFeild;
	
	@FindBy (xpath="//input[@id='FormRow-BUY-quantity']")
	WebElement stopAmounFeild;
	
	
	@FindBy (xpath="//a[@id='trade-orderForm-a-BUYlogin']")
	WebElement logInTrade;


	public PairTradingViewPage(){
	PageFactory.initElements(driver, this);
}
	
	
	public boolean verifyChart() {
		return tradingchart.isDisplayed();
	}
	
	public boolean verifyLimitButton() {
		return limitBtn.isEnabled();	
	}
	
	public void inputLimitAmount(int lamount) {
		
	limitAmountForLimit.sendKeys("lamount");		
	}
	public boolean marketBtn() {
		return marketBtn.isEnabled();
		
	}
	
	public boolean stopLimitButton() {
		return stopLimitBtn.isEnabled();
	}
}