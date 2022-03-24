package Com.testscenarios;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Utilities.Commonfunctionalities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQA_Karthik extends Commonfunctionalities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  //WebDriver driver; 
		  //WebDriverManager.chromedriver().setup(); driver = new
		  //ChromeDriver();
		chromebrowserlaunch();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
		
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.xpath("//button[@aria-label='Toggle']")).click();
		System.out.println("Home Toggle button opened");
		driver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-expanded']")).click();
		System.out.println("Document Toggle button opened");
		//		driver.findElement(By.className("rct-checkbox")).click();
//		System.out.println("Home checkbox checked");
//		driver.findElement(By.className("rct-collapse rct-collapse-btn")).click();
//		driver.findElement(By.className("rct-title")).click();
		
	}

}
