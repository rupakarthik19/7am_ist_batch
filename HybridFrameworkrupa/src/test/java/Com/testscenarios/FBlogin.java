package Com.testscenarios;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Utilities.Commonfunctionalities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FBlogin extends Commonfunctionalities {

	public static void main(String[] args) {
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
		chromebrowserlaunch();
		driver.get("https://www.facebook.com/");

	driver.findElement(By.id("display")).sendKeys("abcedrf@gmail.coms");
    System.out.println("hi");		
	}

}
