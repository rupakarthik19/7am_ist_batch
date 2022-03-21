package Com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmaillogin {

	public static void main(String[] args) throws Exception {
		
		Thread.sleep(5000);
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://accounts.google.com/");
	driver.findElement(By.id("yDmH0d")).sendKeys("abcdef@gmail.com");
	driver.findElement(By.className("nyoS7c UzCXuf EIlDfe")).click();
		
		
		
		
		
		
			//By.class("class=\"nyoS7c UzCXuf EIlDfe\"")).click();
		

	}

}
