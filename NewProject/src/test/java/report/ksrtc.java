package report;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


@Listeners(listeners.class)
public class ksrtc {
	
	@Test
	public void KSRTCRegistration() throws InterruptedException
	{   
	    System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Chrome driver\\chromedriver.exe");
	 
	    WebDriver d1 =new ChromeDriver();
	    d1.manage().window().maximize();
	   
        d1.get("https://ksrtc.in/oprs-web/user/add.do");
        
      //Registration page/
        d1.findElement(By.name("email")).sendKeys("lalitaapawar2803@gmail.com");
	    d1.findElement(By.id("fullName")).sendKeys("Lalita Ajinath PAwar");
	    d1.findElement(By.name("mobileNo")).sendKeys("9763337404");
 	    d1.findElement(By.name("SaveBtn")).click();
 	    d1.switchTo().alert().accept();
 	    Thread.sleep(1000);
 	   
        
	}

	@Test
	public void KSRTCLogin() throws InterruptedException
	{
		    System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Chrome driver\\chromedriver.exe");
		   
		     WebDriver d1 =new ChromeDriver();
		    d1.manage().window().maximize();
		    
		    d1.get("https://ksrtc.in/oprs-web/login/show.do");
		  
		   // Login Page
			d1.findElement(By.id("userName")).sendKeys("lalitaapawar2803@gmail.com");
		    d1.findElement(By.name("password")).sendKeys("Lalita@1234");
			d1.findElement(By.id("submitBtn")).click();
			Thread.sleep(1000);	  
		}
	
	@Test
	public void KSRTCsearchthebus() throws InterruptedException
	{
		    System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Chrome driver\\chromedriver.exe");
		   
		    
		    WebDriver d1 =new ChromeDriver();
		    d1.manage().window().maximize();
		    d1.get("https://ksrtc.in/oprs-web/login/show.do");
		    d1.findElement(By.id("userName")).sendKeys("lalitaapawar2803@gmail.com");
		    d1.findElement(By.name("password")).sendKeys("Lalita@1234");
			d1.findElement(By.id("submitBtn")).click();
			
			
		    // Scroll down the page//
		   JavascriptExecutor js1 = (JavascriptExecutor) d1; 
		   js1.executeScript("window.scrollBy(0,200)");
			  
			  //Searching a bus//
			  
			  //1. leaving from
		   d1.findElement(By.id("fromPlaceName")).sendKeys("PUNE"+Keys.ARROW_DOWN+Keys.ENTER);
		   Thread.sleep(1000);
			  
			  // 2.To place
		   d1.findElement(By.id("toPlaceName")).sendKeys("PUNE"+Keys.ARROW_DOWN+Keys.ENTER);
		   Thread.sleep(1000);
			  
			  //3.Date Selection
			JavascriptExecutor jse= (JavascriptExecutor)d1;
			jse.executeScript("document.getElementById('txtJourneyDate').value='30/08/2021'");
			jse.executeScript("document.getElementById('txtReturnJourneyDate').value='30/09/2021'");
			 
			
			d1.findElement(By.id("corover-close-btn")).click();
		    
		    d1.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
		  
	}
			 
}
	

 