package com.clirnet.sanity;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class Testsel4 {
   
    public static void main(String args[]) throws InterruptedException, MalformedURLException
    
    {
//    	ChromeOptions browserOptions = new ChromeOptions();
//    	browserOptions.setPlatformName("Windows 10");
//    	browserOptions.setBrowserVersion("77");
//    	Map<String, Object> sauceOptions = new HashMap<String, Object>();
//    	sauceOptions.put("username", "oauth-kumar.amitsingh0657-42999");
//    	sauceOptions.put("accessKey", "edfdecba-5b07-4055-be8b-a7f411ae7710");
//    	sauceOptions.put("build", "<your build id>");
//    	sauceOptions.put("name", "<your test name>");
//    	browserOptions.setCapability("sauce:options", sauceOptions);
//
//    	URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
//    	RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
       
        WebDriver driver = new ChromeDriver();
 
        // Maximize the browser
        driver.manage().window().maximize();
 
        // Launch Website
        
        driver.get("https://doctor.clirnet.com/");
        
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[3]/button")));
        
        driver.findElement(By.xpath("//div[3]/button")).click();
        
        driver.findElement(By.id("floatingInput")).sendKeys("anant.sahu@clirnet.com");
        
        driver.findElement(By.id("floatingInput1")).sendKeys("12345");
        
        driver.findElement(By.xpath("//div[3]/button")).click();
       
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='onesignal-slidedown-cancel-button']")));
        
        driver.findElement(By.xpath("//button[@id='onesignal-slidedown-cancel-button']")).click();
        
        Thread.sleep(5000);
        
        String doctorname = driver.findElement(By.xpath("//div[@id='main_outlet']/div/div/div/div/div/div/div[2]/h2")).getText();
        
        System.out.println(doctorname);
        
//        Assert.assertEquals(doctorname, "Anantt kr Sahu");
        
//        driver.findElement(By.xpath("//a[@id='change-speciality-button']/span")).click();
//        
//        //Thread.sleep
//        driver.findElement(By.xpath("//input[@id='checkbox_1']")).click();
//        
//        driver.findElement(By.xpath("//button[contains(.,'Next')]")).click();
//        
        //driver.quit();
    }
    
}