package PracticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenshotPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		// initilizing web driver
		WebDriver driver =  new ChromeDriver();
		//launching url
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize(); // maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicitly wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); //explicit wait 
		
		
		
		
		             
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
