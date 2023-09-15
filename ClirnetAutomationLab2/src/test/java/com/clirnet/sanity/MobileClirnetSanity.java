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

import com.clirnet.setup.MobDriverInit;
import com.clirnet.setup.MobileAccess;
import com.clirnet.setup.WebAccess;
import com.clirnet.setup.WebDriverInit;
import com.clirnet.setup.MobDriverInit;
import com.clirnet.setup.scrollfunction;
 
public class MobileClirnetSanity

{
	
	//@BeforeTest
	
	@Test (priority=0)
   
	
	public static void HomeReadMedwiki() throws InterruptedException, IOException
    
    {
		
// Local machine configuration
		MobileAccess.set();
		MobDriverInit.getDriver().manage().window().maximize();
		
//UAT URL
	//	MobDriverInit.getDriver().get("https://uat-doctorgl.clirnet.com/");
		
//Production url
		MobDriverInit.getDriver().get("https://doctor.clirnet.com/");
       
		WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));

//Not Required for the US/EU Server.Its required only for the india 		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[3]/button")));
		MobDriverInit.getDriver().findElement(By.xpath("//div[3]/button")).click();
		
		//Thread.sleep(10000);
        MobDriverInit.getDriver().findElement(By.id("floatingInput")).sendKeys("anant.sahu@clirnet.com");
        MobDriverInit.getDriver().findElement(By.id("floatingInput1")).sendKeys("12345");
        MobDriverInit.getDriver().findElement(By.xpath("//div[3]/button")).click();
        Thread.sleep(5000);
 
  //Notification dialog required for production
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onesignal-slidedown-allow-button")));
        MobDriverInit.getDriver().findElement(By.id("onesignal-slidedown-allow-button")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("common_nav_bar_read")));
        MobDriverInit.getDriver().findElement(By.id("common_nav_bar_read")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_outlet']/div/div/div/div/div/div[3]/div/div/div/div/div/div[2]/div[2]/div/h2")));
        MobDriverInit.getDriver().findElement(By.xpath("//div[@id='main_outlet']/div/div/div/div/div/div[3]/div/div/div/div/div/div[2]/div[2]/div/h2")).click();
        
        
    }
        
      
        @Test (priority=1)
        
        public static void homeclick() throws InterruptedException
    	
    	{
        	
        	Thread.sleep(6000);
        	
       	
        	MobDriverInit.getDriver().findElement(By.xpath("//div[@id='root']/div/div/nav/div/div[2]/span/i")).click();
  
//Step for production required      	
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onesignal-slidedown-allow-button")));
            MobDriverInit.getDriver().findElement(By.id("onesignal-slidedown-allow-button")).click();
              
        	
    	}
        
        @Test (priority=2)
        
        public static void doctubeclick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[2]/ul/li[2]/a")));
        	MobDriverInit.getDriver().findElement(By.xpath("//nav[2]/ul/li[2]/a")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Edit profile")));
        	WebElement ele=MobDriverInit.getDriver().findElement(By.linkText("Edit profile"));
    		Assert.assertTrue(ele.isDisplayed());
        	
        	
    	}
        
        @Test (priority=3)
        
        public static void communityclick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Community')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Community')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Follow")));
        	WebElement ele=MobDriverInit.getDriver().findElement(By.linkText("Follow"));
    		Assert.assertTrue(ele.isDisplayed());
        	
    	}
        
        @Test (priority=4)
        
        public static void ExploreClick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	Thread.sleep(2000);
        	    	
    	}
        
        @Test (priority=5)
        
        public static void LiveCMEClick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='2']/div/div/span")));
        	MobDriverInit.getDriver().findElement(By.xpath("//div[@id='2']/div/div/span")).click();
        	Thread.sleep(2000);
        	
        	    	}
        
        @Test (priority=6)
        
        public static void LiveMedWikiClick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@src,'https://storage.googleapis.com/medwiki/common/clirnet-menu-icons/Medwiki-icon.svg')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//img[contains(@src,'https://storage.googleapis.com/medwiki/common/clirnet-menu-icons/Medwiki-icon.svg')]")).click();
        	Thread.sleep(2000);
        	
    	}
        
        @Test (priority=7)
        
        public static void ClinicalvideoClick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	Thread.sleep(2000);
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@src,'https://storage.googleapis.com/medwiki/common/clirnet-menu-icons/ClinicalVideo-icon.svg')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//img[contains(@src,'https://storage.googleapis.com/medwiki/common/clirnet-menu-icons/ClinicalVideo-icon.svg')]")).click();
        	Thread.sleep(3000);
        	    	
    	}
        
        @Test (priority=8)
        
        public static void ClickGrandRounds() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@src,'https://storage.googleapis.com/medwiki/common/clirnet-menu-icons/GrandRound-icon.svg')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//img[contains(@src,'https://storage.googleapis.com/medwiki/common/clirnet-menu-icons/GrandRound-icon.svg')]")).click();
        	Thread.sleep(3000);
        	    	
    	}
        
        @Test (priority=9)
        
        public static void CoursesClick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@src,'https://storage.googleapis.com/medwiki/common/clirnet-menu-icons/training-icon.svg')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//img[contains(@src,'https://storage.googleapis.com/medwiki/common/clirnet-menu-icons/training-icon.svg')]")).click();
        	Thread.sleep(2000);
        	    	
    	}
        
        @Test (priority=10)
        
        public static void PollClick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@src,'https://storage.googleapis.com/medwiki/common/clirnet-menu-icons/Polls-icon.svg')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//img[contains(@src,'https://storage.googleapis.com/medwiki/common/clirnet-menu-icons/Polls-icon.svg')]")).click();
        	Thread.sleep(3000);
        	    	
    	}
        
        @Test (priority=11)
        
        public static void DDXClick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Differential Diagnosis')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Differential Diagnosis')]")).click();
        	Thread.sleep(3000);
        	    	
    	}
        
        @Test (priority=12)
        
        public static void Epaper() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@src,'https://storage.googleapis.com/medwiki/common/clirnet-menu-icons/EBook-icon.svg')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//img[contains(@src,'https://storage.googleapis.com/medwiki/common/clirnet-menu-icons/EBook-icon.svg')]")).click();
        	Thread.sleep(3000);
        	    	
    	}
        
        @Test (priority=13)
        
        public static void Telemed() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='12']/div/div/div")));
        	MobDriverInit.getDriver().findElement(By.xpath("//div[@id='12']/div/div/div")).click();
        	Thread.sleep(3000);
        	    	
    	}
        
        @Test (priority=14)
        
        public static void DR() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Discuss & Refer')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Discuss & Refer')]")).click();
        	//Thread.sleep(3000);
        	    	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("discuss_refer_explore_more")));
        	WebElement ele=MobDriverInit.getDriver().findElement(By.id("discuss_refer_explore_more"));
        	Assert.assertTrue(ele.isDisplayed());
        	
    	}
        
        @Test (priority=15)
        
        public static void EditProfile() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
        	MobDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Home')]")).click();
        	
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='user image']")));
        	MobDriverInit.getDriver().findElement(By.xpath("//img[@alt='user image']")).click();
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Profile")));
        	MobDriverInit.getDriver().findElement(By.linkText("Profile")).click();
        	
//        	Thread.sleep(5000);
//          
//        	String doctorname = MobDriverInit.getDriver().findElement(By.xpath("//div[@id='main_outlet']/div/div/div/div/div/div/div[2]/h2")).getText();
//        	
//        	System.out.println(doctorname);
//          
        	
//        	Assert.assertEquals(doctorname, "Anantt kr Sahu");
        	
        	Thread.sleep(5000);
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("common_nav_bar_certificate")));
        	MobDriverInit.getDriver().findElement(By.id("common_nav_bar_certificate")).click();
        	Thread.sleep(5000);
        	MobDriverInit.getDriver().findElement(By.cssSelector(".false:nth-child(1) .object-fit-cover")).click();
        	Thread.sleep(3000);
        	      	    	
    	}
        
        @Test (priority=16)
        
        public static void HeaderNavigation() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
   
        	MobDriverInit.getDriver().findElement(By.cssSelector(".flaticon-home-speciality")).click();
        	Thread.sleep(2000);
        	
        	MobDriverInit.getDriver().findElement(By.id("common_nav_bar_read")).click();    
        	Thread.sleep(2000);
        	
//        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main_outlet']/div/div/div/div[2]/div/div[2]/div/div[2]/i")));
//        	WebElement ele=MobDriverInit.getDriver().findElement(By.xpath("//div[@id='main_outlet']/div/div/div/div[2]/div/div[2]/div/div[2]/i"));
//    		Assert.assertTrue(ele.isDisplayed());
        	
        	
        	MobDriverInit.getDriver().findElement(By.id("common_nav_bar_watch")).click();
        	Thread.sleep(2000);
        	MobDriverInit.getDriver().findElement(By.id("common_nav_bar_cme")).click();
        	Thread.sleep(2000);
        	MobDriverInit.getDriver().findElement(By.id("common_nav_bar_opinions")).click();
        	Thread.sleep(2000);
        	MobDriverInit.getDriver().findElement(By.cssSelector(".swiper-button-next")).click();
        	Thread.sleep(2000);
        	MobDriverInit.getDriver().findElement(By.id("common_nav_bar_courses")).click();
        	Thread.sleep(2000);
    	}
        
        @Test (priority=17)
        
        public static void TrendingNowClick() throws InterruptedException
    	
    	{
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
        	MobDriverInit.getDriver().findElement(By.cssSelector(".flaticon-next")).click();
        	Thread.sleep(5000);
            	
    	}
        
        @Test (priority=18)
        
        public static void EbookDetail() throws InterruptedException
    	
    	{
        	MobDriverInit.getDriver().findElement(By.cssSelector(".flaticon-home-speciality")).click();
        	
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	Thread.sleep(3000);
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@src,'https://storage.googleapis.com/medwiki/common/clirnet-menu-icons/EBook-icon.svg')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//img[contains(@src,'https://storage.googleapis.com/medwiki/common/clirnet-menu-icons/EBook-icon.svg')]")).click();
        	Thread.sleep(3000);
        	
        	MobDriverInit.getDriver().findElement(By.xpath("//section[@id='ebook_listing']/div/div/div/div/div/div/img")).click();
        	Thread.sleep(10000);
        	
      
        	
    	}
        
        @Test (priority=19)
        
        public static void LiveCmeDetail() throws InterruptedException
    	
    	{
//        	MobDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Home')]")).click();
        	
        	MobDriverInit.getDriver().findElement(By.cssSelector(".flaticon-home-speciality")).click();
        	
        	WebDriverWait wait = new WebDriverWait(MobDriverInit.getDriver(),Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Explore')]")));
        	MobDriverInit.getDriver().findElement(By.xpath("//span[contains(.,'Explore')]")).click();
        	Thread.sleep(3000);
        	
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='2']/div/div/span")));
        	MobDriverInit.getDriver().findElement(By.xpath("//div[@id='2']/div/div/span")).click();
        	
        	Thread.sleep(5000);
        	MobDriverInit.getDriver().findElement(By.xpath("//div[@id='session_landing_featured_card']/div[2]/div/div[2]/div/div[2]/div/div")).click();
        	Thread.sleep(5000);
        	
        	WebElement ele=MobDriverInit.getDriver().findElement(By.xpath("//div[@id='root']/div/div/nav"));
    		Assert.assertTrue(ele.isDisplayed());
        	
        	
        	Thread.sleep(5000);
        	MobDriverInit.getDriver().quit();
        	
    	}
        
 
     
    }
    