package PracticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

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
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		driver.findElement(By.linkText("Forgot your password?")).click();
		
		
		// constructing css path 
		//using class name - > tagname.classname - > p.error
		//using id - >tagname#id - >input#inputUsername
		//using tagnem->tagname[attributename = 'value']->input[placeholder = 'username']
		
		// input[type='text']:nth-child(2) -  css selector 
		
		//XPATH
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Yuvaraj");
		driver.findElement(By.cssSelector("input[placeholder=Email]")).sendKeys("yuvrajmu@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9972002373");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("yuvarajmu.abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		//css selector with index
		 //tagname[attribute=name]:nth-child(2)
		
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("yuvrajmu@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).clear();
		
		// parent child traversal of xpath //perenttag/childtag[1]--> with index
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9972002373");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		// elementClickIntercepted exception - just we need to resolve the sysnchronisation issue 
		
		// goto login page
		
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		//regular expression using css selector 
		
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		
		driver.findElement(By.name("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
