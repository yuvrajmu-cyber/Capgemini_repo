package PracticePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggesteDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//test
		// test 2
		//test 3
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriverManager.edgedriver().setup();
		 //WebDriver driver = new EdgeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
		
	List<WebElement> options = 	driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
	for(WebElement option : options) {
		
		if(option.getText().equalsIgnoreCase("India")) {
			Thread.sleep(4000);
			option.click();
			break;
		}
	}
		
		

	}

}
