package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns {

	public static void main(String[] args) {
		// yuva

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[contains(text(),'Adult')]")).click();
		
		
		for(int i=1;i<5;i++) {
			driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']//div[1]//div[2]//div[3]")).click();
		
		}
		
		System.out.println(	driver.findElement(By.xpath("//div[contains(text(),'Adult')]")).getText());
		System.out.println("testing is completed");
		
		
	}

}
