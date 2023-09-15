package com.clirnet.sanity;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.clirnet.setup.WebAccess;
import com.clirnet.setup.WebDriverInit;
import com.clirnet.setup.scrollfunction;
 
public class ClirnetSanity

{
	
	//@BeforeTest
	
	@Test (priority=0)
   	
	public static void HomeReadMedwiki() throws InterruptedException, IOException
    
    {
		
		WebAccess.set();
		WebDriverInit.getDriver().manage().window().maximize();
		
//URL configuartion		
		//UAT URL
		//WebDriverInit.getDriver().get("https://uat-doctorgl.clirnet.com/");
		
		//Production url
		WebDriverInit.getDriver().get("https://doctor.clirnet.com/");
		
        WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(30));
        
        Thread.sleep(5000);
        
//For india we need to uncomment following line
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[3]/button")));
        WebDriverInit.getDriver().findElement(By.xpath("//div[3]/button")).click();
      
        WebDriverInit.getDriver().findElement(By.id("floatingInput")).sendKeys("anant.sahu@clirnet.com");
        WebDriverInit.getDriver().findElement(By.id("floatingInput1")).sendKeys("12345");
        WebDriverInit.getDriver().findElement(By.xpath("//div[3]/button")).click();
        
        
 //Notification dialog required for production
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='onesignal-slidedown-cancel-button']")));
        WebDriverInit.getDriver().findElement(By.xpath("//button[@id='onesignal-slidedown-cancel-button']")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("common_nav_bar_read")));
        WebDriverInit.getDriver().findElement(By.id("common_nav_bar_read")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_outlet']/div/div/div/div[2]/div/div[4]/div/div/div/div/div/div[2]/div[2]/div/h2")));
        WebDriverInit.getDriver().findElement(By.xpath("//div[@id='main_outlet']/div/div/div/div[2]/div/div[4]/div/div/div/div/div/div[2]/div[2]/div/h2")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("medwiki_related_post_view_more")));
        
        String expmedwikiexplore = WebDriverInit.getDriver().findElement(By.id("medwiki_related_post_view_more")).getText();
        Assert.assertEquals(expmedwikiexplore, "Explore More");
        
    }
        
      
        @Test (priority=1)
        
        public static void homeclick() throws InterruptedException
    	
    	{
        	
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Home')]")).click();
        	
        	
    	}
        
        @Test (priority=2)
        
        public static void doctubeclick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'DocTube™')]")));
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'DocTube™')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Edit profile")));
        	WebElement ele=WebDriverInit.getDriver().findElement(By.linkText("Edit profile"));
    		Assert.assertTrue(ele.isDisplayed());
        	
        	
    	}
        
        @Test (priority=3)
        
        public static void communityclick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Community')]")));
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Community')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Follow")));
        	WebElement ele=WebDriverInit.getDriver().findElement(By.linkText("Follow"));
    		Assert.assertTrue(ele.isDisplayed());
        	
    	}
        
        @Test (priority=4)
        
        public static void ExploreClick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	    	
    	}
        
        @Test (priority=5)
        
        public static void LiveCMEClick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(20));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Live CME")));
        	WebDriverInit.getDriver().findElement(By.linkText("Live CME")).click();
        	Thread.sleep(2000);
        	    	
    	}
        
        @Test (priority=6)
        
        public static void LiveMedWikiClick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("MedWiki®")));
        	WebDriverInit.getDriver().findElement(By.linkText("MedWiki®")).click();
        	Thread.sleep(2000);
        	
    	}
        
        @Test (priority=7)
        
        public static void ClinicalvideoClick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Clinical Videos")));
        	WebDriverInit.getDriver().findElement(By.linkText("Clinical Videos")).click();
        	Thread.sleep(3000);
        	    	
    	}
        
        @Test (priority=8)
        
        public static void ClickGrandRounds() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Grand Rounds")));
        	WebDriverInit.getDriver().findElement(By.linkText("Grand Rounds")).click();
        	Thread.sleep(3000);
        	    	
    	}
        
        @Test (priority=9)
        
        public static void CoursesClick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Certified Courses')]")));
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Certified Courses')]")).click();
        	Thread.sleep(2000);
        	    	
    	}
        
        @Test (priority=10)
        
        public static void PollClick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Poll & Quizzes")));
        	WebDriverInit.getDriver().findElement(By.linkText("Poll & Quizzes")).click();
        	Thread.sleep(3000);
        	    	
    	}
        
        @Test (priority=11)
        
        public static void DDXClick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Differential Diagnosis')]")));
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Differential Diagnosis')]")).click();
        	Thread.sleep(3000);
        	    	
    	}
        
        @Test (priority=12)
        
        public static void Epaper() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("E-Paper")));
        	WebDriverInit.getDriver().findElement(By.linkText("E-Paper")).click();
        	Thread.sleep(3000);
        	    	
    	}
        
        @Test (priority=13)
        
        public static void Telemed() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Telemed Lite")));
        	WebDriverInit.getDriver().findElement(By.linkText("Telemed Lite")).click();
        	Thread.sleep(3000);
        	    	
    	}
        
        @Test (priority=14)
        
        public static void DR() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Discuss & Refer')]")));
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Discuss & Refer')]")).click();
        	//Thread.sleep(3000);
        	    	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("discuss_refer_explore_more")));
        	WebElement ele=WebDriverInit.getDriver().findElement(By.id("discuss_refer_explore_more"));
        	Assert.assertTrue(ele.isDisplayed());
        	
    	}
        
        @Test (priority=15)
        
        public static void EditProfile() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(10));
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Home')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("profile-edit-btn")));
        	WebDriverInit.getDriver().findElement(By.id("profile-edit-btn")).click();
        	
        	Thread.sleep(5000);
          
        	String doctorname = WebDriverInit.getDriver().findElement(By.xpath("//div[@id='main_outlet']/div/div/div/div/div/div/div[2]/h2")).getText();
        	
        	System.out.println(doctorname);
          
        	Thread.sleep(5000);
        	Assert.assertEquals("Anant kumar Sahu",doctorname);
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("common_nav_bar_certificate")));
        	WebDriverInit.getDriver().findElement(By.id("common_nav_bar_certificate")).click();
        	Thread.sleep(4000);
        	WebDriverInit.getDriver().findElement(By.cssSelector(".false:nth-child(1) .object-fit-cover")).click();
        	Thread.sleep(3000);
        	
        	
        	    	
    	}
        
        @Test (priority=16)
        
        public static void HeaderNavigation() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(10));
        	
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Home')]")).click();
        	Thread.sleep(2000);
        	
        	WebDriverInit.getDriver().findElement(By.id("common_nav_bar_read")).click();    
        	Thread.sleep(2000);
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_outlet']/div/div/div/div[2]/div/div[2]/div/div[2]/i")));
        	WebElement ele=WebDriverInit.getDriver().findElement(By.xpath("//div[@id='main_outlet']/div/div/div/div[2]/div/div[2]/div/div[2]/i"));
    		Assert.assertTrue(ele.isDisplayed());
        	
        	
        	WebDriverInit.getDriver().findElement(By.id("common_nav_bar_watch")).click();
        	Thread.sleep(2000);
        	WebDriverInit.getDriver().findElement(By.id("common_nav_bar_cme")).click();
        	Thread.sleep(2000);
        	WebDriverInit.getDriver().findElement(By.id("common_nav_bar_opinions")).click();
        	Thread.sleep(2000);
        	WebDriverInit.getDriver().findElement(By.id("common_nav_bar_courses")).click();
        	Thread.sleep(2000);
    	}
        
        @Test (priority=17)
        
        public static void TrendingNowClick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(10));
        	WebDriverInit.getDriver().findElement(By.xpath("//div[@id='main_outlet']/div/div/div/div[2]/div/div[2]/div/div[2]/i")).click();
        	Thread.sleep(5000);
            	
    	}
        
        @Test (priority=18)
        
        public static void EbookDetail() throws InterruptedException
    	
    	{
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Home')]")).click();
        	
        	WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("E-Paper")));
        	WebDriverInit.getDriver().findElement(By.linkText("E-Paper")).click();
        	Thread.sleep(3000);
        	
        	WebDriverInit.getDriver().findElement(By.xpath("//section[@id='ebook_listing']/div/div/div/div[5]/div/div/img")).click();
        	Thread.sleep(10000);
        	scrollfunction.scrollto();
        	Thread.sleep(5000);
      
        	
    	}
        
        @Test (priority=19)
        
        public static void LiveCmeDetail() throws InterruptedException
    	
    	{
//        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Home')]")).click();
        	
        	WebDriverWait wait = new WebDriverWait(WebDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	WebDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Live CME")));
        	WebDriverInit.getDriver().findElement(By.linkText("Live CME")).click();
        	
        	Thread.sleep(5000);
        	
        	WebDriverInit.getDriver().findElement(By.xpath("//div[@id='session_upcoming']/div[2]/div[2]/div/div/div/div[2]")).click();
        	Thread.sleep(5000);
        	
        	WebElement ele=WebDriverInit.getDriver().findElement(By.linkText("Get Recording"));
    		Assert.assertTrue(ele.isDisplayed());
        	
        	//scrollfunction.scrollto();
        	//Thread.sleep(5000);
        	WebDriverInit.getDriver().quit();
        	
    	}
        
 
     
    }
    