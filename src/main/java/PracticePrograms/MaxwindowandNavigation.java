package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MaxwindowandNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-web-security");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		// Handling static dropdown 
		
		
		
		WebElement staticDropdown = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
