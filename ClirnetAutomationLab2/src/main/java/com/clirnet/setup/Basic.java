package com.clirnet.setup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	
	public static WebDriver driver;
	public static String chromepath;
	
	public static WebDriver initializeDriver() throws IOException 
	{
		String workDir = System.getProperty("user.dir");
		String proppath = "//src//main//java//com//clirnet//setup//data.properties";
		File mypropFile = new File(workDir , proppath);
		String propfile = mypropFile.getPath();
		
		
		
		
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream (propfile);
		
		prop.load(fis);
		
		String browserName  = prop.getProperty("browser");
		
		String driverName  = prop.getProperty("cdriver");
		
		if (driverName.equals("Mac"))
		{
		
			String chromefile = "src//main//java//JARS//Chrome//MACOS//chromedriver";
			File mychromefile = new File (workDir , chromefile);
			chromepath = mychromefile.getPath();
		}
		else if (driverName.equals("Windows"))
		{
			String chromefile = "src//main//java//JARS//Chrome//Windows//chromedriver.exe";
			File mychromefile = new File (workDir , chromefile);
			chromepath = mychromefile.getPath();
		}
		
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", chromepath);
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			// firefox browser should be invoked
		}
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverInit.initDriver(driver);
		return driver;
		
		
		
		
		
	}
	
	
	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) WebDriverInit.getDriver();
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"//reports//"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;


	}

}
