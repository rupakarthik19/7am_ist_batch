package Com.testscenarios;


import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.jcip.annotations.GuardedBy;

public class FBlogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");

	driver.findElement(By.id("display")).sendKeys("abcedrf@gmail.coms");
	

		
		
		
		
	}

}
