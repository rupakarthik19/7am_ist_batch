package Com.testscenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Com.Utilities.Commonfunctionalities;



public class Assignment11_03222022 extends Commonfunctionalities {

	@Test
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		chromebrowserlaunch();
		
		driver.get("https://forms.toyota.co.uk/brochure");
		Thread.sleep(2000);
		
		System.out.println("max");
		clickbyanylocator(By.xpath("//a[@id='tgbgdpr-overlay-agree']"));
		
		clickbyanylocator(By.xpath("//li[@data-display='All New Yaris Cross']"));
		System.out.println("Corolla Hybrid selected");
		
		//dropdown	
		clickbyanylocator(By.xpath("//a[@class='dropdown-toggle  ']"));
		
		clickbyanylocator(By.xpath("//a[@data-value='Mrs']"));
		sendkeybyanylocator(By.name("firstname"), "Karthik");
		sendkeybyanylocator(By.name("surname"), "Arey");
		//driver.findElement(By.name("email")).sendKeys("");
		clickbyanylocator(By.id("submit-br"));
		
		takescreenshot();
		System.out.println("End of execution");

		}

}
