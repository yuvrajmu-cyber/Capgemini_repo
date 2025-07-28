package PracticePrograms;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class getWindowHandles {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub\
		
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> child = driver.getWindowHandles();
		
		for(String option : child) {
			
			
			if(!parent.equals(option)) {
				
				driver.switchTo().window(option);
				System.out.println(driver.getTitle());
				driver.close();
				
				
			}
	
			driver.switchTo().window(parent);
			System.out.println(driver.getTitle());
			
		
		
		Thread.sleep(5000);
		
		
		Actions action = new Actions(driver);
		
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'YouTube Courses')]"))).perform();
		
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screenshot.png"));  // Save screenshot

		}
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
