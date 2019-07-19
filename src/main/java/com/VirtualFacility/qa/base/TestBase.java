package com.VirtualFacility.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		

			try {

				prop=new Properties();

				FileInputStream ip= new FileInputStream("C:\\Users\\Sharmi\\eclipse-workspace\\new\\VirtualFacilityTest\\src\\main\\java\\com\\VirtualFacility\\qa\\config\\config.properties");
				prop.load(ip);
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch( IOException e) {
				e.printStackTrace();	
			}
		}



		public static void initialization() {

			String browserName= prop.getProperty("browser");
			if (browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmi\\Downloads\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if (browserName.equals("FF")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sharmi\\Downloads\\geckodriver.exe");
				driver = new FirefoxDriver();
			}


			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			TimeUnit unit;
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));

		}
		
	}