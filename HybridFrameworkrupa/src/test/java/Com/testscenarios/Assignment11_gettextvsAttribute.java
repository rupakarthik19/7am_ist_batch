package Com.testscenarios;

import org.openqa.selenium.By;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Assignment11_gettextvsAttribute {

	//private static final String TakesScreenshot = null;

	public static void main(String[] args) throws Exception {

		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		
		driver.get("https://forms.toyota.co.uk/brochure");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		System.out.println("max");
		//driver.findElement(By.xpath("//a[@class='tgbgdpr-cta-primary']")).click();
		driver.findElement(By.xpath("//a[@id='tgbgdpr-overlay-agree']")).click();
		
		//driver.findElement(By.xpath("//li[@data-label='All New Corolla Hybrid']")).click();
		
		driver.findElement(By.xpath("//li[@data-display='All New Yaris Cross']")).click();
		System.out.println("Corolla Hybrid selected");
		
		//dropdown	
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle  ']")).click();
		
		driver.findElement(By.xpath("//a[@data-value='Mrs']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
    
		
		
		
		
		
	}

}
