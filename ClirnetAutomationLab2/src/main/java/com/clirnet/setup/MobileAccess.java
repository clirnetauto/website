package com.clirnet.setup;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.clirnet.setup.WebDriverInit;

//import io.appium.java_client.android.AndroidDriver;


public class MobileAccess 

{

public static WebDriver driver;
public static String chromepath;


	public static void set() throws IOException 
	
	{	
//Sauce lab Amit account Setting
//		ChromeOptions browserOptions = new ChromeOptions();
//		browserOptions.setPlatformName("Windows 10");
//		browserOptions.setBrowserVersion("77");
//		Map<String, Object> sauceOptions = new HashMap<>();
//		sauceOptions.put("username", "oauth-amit.singh-2f7cc");
//		sauceOptions.put("accessKey", "*****a982");
//		sauceOptions.put("build", "<your build id>");
//		sauceOptions.put("name", "<your test name>");
//		browserOptions.setCapability("sauce:options", sauceOptions);
//
//		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
//		RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
//	//	AndroidDriver driver = new AndroidDriver(url, caps);
//		
//		MobDriverInit.initDriver(driver);
//		
		

//Local Setup
		Map<String, String> mobileEmulation = new HashMap<String, String>();

		mobileEmulation.put("deviceName", "Pixel 5");
		
		//mobileEmulation.put("deviceName", "Pixel 5");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\ClirnetAutomationlab\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		MobDriverInit.initDriver(driver);

   }

}



