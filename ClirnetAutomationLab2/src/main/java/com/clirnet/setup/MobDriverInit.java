package com.clirnet.setup;

import org.openqa.selenium.WebDriver;


public class MobDriverInit {
	
	private static WebDriver wDriver;
	
	// initialized
	
	public static void initDriver(WebDriver driver){
		System.out.println("----Webdriverinit-----");
		wDriver = driver;
	}
	
	// return driver object
	public static WebDriver getDriver() {
		return wDriver;
	}
	
	
}


