package Com.testscenarios;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest_Cross_Browsing {
  //@Test
  public void f() throws Exception {
  
	  
	  WebDriver driver;
	  WebDriverManager.chromedriver().setup();
	  
	  driver=new ChromeDriver();
  
 
  
	  driver.get("https://forms.toyota.co.uk/brochure");
	  driver.manage().window().maximize();
  Thread.sleep(2000);
  
	
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//a[@id='tgbgdpr-overlay-agree']")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//li[@data-display='All New Yaris Cross']")).click();
	 
	 driver.findElement(By.xpath("//a[@class='dropdown-toggle  ']")).click();
	 driver.findElement(By.xpath("//a[@data-value='Mrs']")).click();  
  
	 driver.findElement(By.xpath("//input[@class='narrow-icon-field  validation-letterswithbasicpunc']")).
	 sendKeys("Rupa");
  
	 driver.findElement(By.xpath("//input[@name='surname']")).
	 sendKeys("Kankruthi");

	 driver.findElement(By.xpath("//input[@type='email']")).
	 sendKeys("india1234@gmail.com");
	 
	 
	 
	 
	 
  }
}
