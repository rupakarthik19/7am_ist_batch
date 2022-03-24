package Com.Utilities;

import java.io.File;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonfunctionalities {

		public static WebDriver driver;
		
		
		public static void chromebrowserlaunch() {
//		WebDriver driver;
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome browser launched");}
		
		
		public static void safaribrowserlaunch() {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			driver.manage().window().maximize();
		}
	
		public static String timestamp() {
			Date d= new Date(0);
			System.out.println(d);
			DateFormat df= new SimpleDateFormat("yyyy_mm_dd_HH_mm_ss");
			//Convert the system date to user defined format
			String timeStamp =df.format(d);
			System.out.println(timeStamp);
			return timeStamp;
		}

		public static void takescreenshot() throws Exception {
			File abc =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String pathofthescreenshotfolder ="./screenshots/";
			FileHandler.copy(abc, new File(pathofthescreenshotfolder + "Testabc" + timestamp()+".PNG"));}
			
			
		/******************SendKey by Any Locator for editbox/Textbox***************/
		
		public static void sendkeybyanylocator(By locator, String testdata) {
			WebElement ele=driver.findElement(locator);
			if (ele.isDisplayed()) {
				if (ele.isEnabled()) {
					ele.clear();
					ele.sendKeys(testdata);
				} else {
					System.out.println("Element is not display, please check the locator");
				}
			}
		}
		
		/******************Click any Webelement***************/
			public static void  clickbyanylocator(By locator) {
				WebElement ele=driver.findElement(locator);
				
				if (ele.isDisplayed() && ele.isEnabled()){
					
				ele.click();}
				else {
				System.out.println("Show error message");
					
					
					
				}
			
			
			
		}
}
