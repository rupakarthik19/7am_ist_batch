package Com.testscenarios;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

import Com.objectrepository.Locators;
import io.github.bonigarcia.wdm.WebDriverManager;

public class justrechargeit {

	public static void main(String[] args) {
		
	WebDriver driver;
		
WebDriverManager.chromedriver().setup();


		driver= new ChromeDriver();
		
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("karthikarey@gmail.com");
driver.findElement(By.name("pass")).sendKeys("Karupanadu01");
driver.findElement(By.name("login")).click();



		
		
	
	}
}
