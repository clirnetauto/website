package com.clirnet.setup;

import org.openqa.selenium.JavascriptExecutor;

public class scrollfunction 

 {

	 	public static void scrollto()

	 	{
	 		JavascriptExecutor js = (JavascriptExecutor)WebDriverInit.getDriver();   
		    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	 		
	 	}

	 	
 }	 	

