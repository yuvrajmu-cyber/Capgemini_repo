package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2'][normalize-space()='From'])[1]")).click();
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Kempegowda International Airport')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Agartala Airport')]")).click();
		
		System.out.println("Completed");
		
		//div[@class='css-1dbjc4n r-1pcd2l5 r-k8qxaj r-glunga r-bnwqim'] //div[@class='css-1dbjc4n r-18u37iz r-1g40b8q'] //div[@data-testid='to-testID-origin']

	}

}
