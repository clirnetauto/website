package com.clirnet.setup;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.clirnet.setup.WebDriverInit;


public class WebAccess 

{

public static WebDriver driver;
public static String chromepath;


	public static void set() throws IOException 
	
	{	
//Sauce Lab Configuration Amit Account
//		ChromeOptions browserOptions = new ChromeOptions();
//		browserOptions.setPlatformName("Windows 10");
//		browserOptions.setBrowserVersion("77");
//		Map<String, Object> sauceOptions = new HashMap<>();
//		sauceOptions.put("username", "clirnetautomation");
//		sauceOptions.put("accessKey", "fe74f338-ec26-4ae0-9efa-3b83468b421f");
//		sauceOptions.put("build", "Build1");
//		sauceOptions.put("name", "clirmobileautomation");
//		sauceOptions.put("screenResolution", "1680x1050");
//		browserOptions.setCapability("sauce:options", sauceOptions);
//
//		URL url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");
//		RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
//		WebDriverInit.initDriver(driver);
		
		
//Sauce Lab Configuration Tech Account
		
//		ChromeOptions browserOptions = new ChromeOptions();
		
//		browserOptions.setPlatformName("Windows 11");
//		browserOptions.setBrowserVersion("100");
//		Map<String, Object> sauceOptions = new HashMap<String, Object>();
//		sauceOptions.put("username", "clirnetautomation");
//		sauceOptions.put("accessKey", "fe74f338-ec26-4ae0-9efa-3b83468b421f");
//		sauceOptions.put("build", "Sanity Auto");
//		sauceOptions.put("name", "ClirnetProdSanity");
//		browserOptions.setCapability("sauce:options", sauceOptions);
//		
//		URL url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");
//		RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
		
		
		
//Local Setup
//	
			driver = new ChromeDriver();
			WebDriverInit.initDriver(driver);
		

   }

}



