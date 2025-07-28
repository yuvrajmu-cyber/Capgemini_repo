package PracticePrograms;

import java.util.List;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdownpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// control+shift+O - for importing packages 
		
		// norml dropdown
		WebDriver driver = new ChromeDriver();
		//driver.get("https://practice.expandtesting.com/dropdown");
		
		//normal dropdown selection 
		
		/*WebElement option = driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select select = new Select(option);
		select.selectByIndex(2);*/
		
		
		
		//without using select class;
		
		
		/*driver.findElement(By.xpath("//select[@id='dropdown']")).click();
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='dropdown']"));
		
		for(WebElement option : options ) {
			
			if(option.getText().equals("India")) {
				
				option.click();
				break;
				
				
			}
			
			
			
		}
		*/
		
		
		
		
		
		
		
		/*********************************************************************************/
		
		
		driver.get("https://www.flipkart.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("mobiles 5g");
		
		
			List<WebElement> options = driver.findElements(By.xpath("//ul//li"));
		Thread.sleep(4000);
		for(WebElement option :options ) {// //a[@class='oleBil']
			
			if(option.getText().contains("mobiles 5g")) {
				
				
				option.click();
				break;
				
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
