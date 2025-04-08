package PracticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Setup ChromeDriver
				WebDriverManager.chromedriver().setup();
				
				 // Set Chrome options to ignore SSL certificate errors
				ChromeOptions options  = new ChromeOptions();
				options.addArguments("--ignore-certificate-errors");
		        options.addArguments("--disable-blink-features=AutomationControlled");
		        options.addArguments("--disable-web-security");
		        
		        
		        // Launch Chrome with the configured options
		    	WebDriver driver = new ChromeDriver(options);
				driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
			     // Print page title
				String title = driver.getTitle();
				System.out.println(title);
				//driver.quit();
				
				//implicit wait
				String name = "rahul";
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(By.linkText("Forgot your password?")).click();
				Thread.sleep(3000);
				
				String passs = getpassword(driver);
				
				driver.findElement(By.className("go-to-login-btn")).click();
				
				
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
				//regular expression using css selector 
				
				driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(passs);
				driver.findElement(By.id("chkboxOne")).click();
				
				driver.findElement(By.name("chkboxTwo")).click();
				driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
				Thread.sleep(3000);
				System.out.println(driver.findElement(By.tagName("p")).getText());
				Thread.sleep(2000);
				Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
				Thread.sleep(3000);
				System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
				Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+name+",");
				driver.findElement(By.xpath("//button[text()='Log Out']")).click();
				//driver.quit();
				
				
				
	}
	
	
	public static String getpassword(WebDriver driver) throws InterruptedException {
		

		Thread.sleep(2000);
	
		driver.findElement(By.className("reset-pwd-btn")).click();
		Thread.sleep(3000);
	
		
		String passwordText =driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = passwordText.split("'");
		String password = passwordArray[1].split("'")[0];
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		return password;
		
		
	}
	
	
	
	
	
	
	
	
	

}
