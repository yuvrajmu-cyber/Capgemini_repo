package PracticePrograms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//List<WebElement> option = wait.until(ExpectedCondition.class(By.xpath("")));
		
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("accepted");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
