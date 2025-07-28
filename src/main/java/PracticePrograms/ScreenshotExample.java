package PracticePrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Initialize the FireFox WebDriver using Selenium Manager
	       WebDriver driver = new ChromeDriver();
	       // Open the plaground webside in a browser session
	       driver.get("https://ecommerce-playground.lambdatest.io/");
	      
	       // Initialize an instance to the TakeScreenshot class
	       TakesScreenshot ts = (TakesScreenshot)driver;
	       // Capture screenshot as output type FILE
			File file = ts.getScreenshotAs(OutputType.FILE);
			
			try {
			    //save the screenshot taken in destination path
				FileUtils.copyFile(file, new File("./ScreenShot_Folder/ecommerce_plaground.png"));
				// Print the title after screenshot capture
		        String title = driver.getTitle();
		        System.out.println("Captured Screenshot for: " +title);
			} catch (IOException e) {
				// Catch any unexpected errors
				e.printStackTrace();
			}
	}
		
		
		
		
		
	}


