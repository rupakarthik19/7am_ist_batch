package Com.testscenarios;

import java.io.FileInputStream;
import java.util.Properties;

import Com.Utilities.Commonfunctionalities;
import Com.objectrepository.Locators;

public class FBpage extends Commonfunctionalities {

	public static void main(String[] args) throws Exception {
		
    		chromebrowserlaunch();
    		/******Locator**********/
			Locators loc = new Locators();
			/****Test data input************/
			FileInputStream fi=new FileInputStream("src/test/resources/Testdata/input.properties"); 
			Properties prop=new Properties();
			prop.load(fi);
			
			driver.get(prop.getProperty("FB_URL"));
			sendkeybyanylocator(loc.FBlogin_email_editbox,prop.getProperty("FB_USERNAME"));
			sendkeybyanylocator(loc.FBlogin_pwd_editbox, prop.getProperty("FB_PWD"));
			clickbyanylocator(loc.FBlogin_submit_clickbutton);
			System.out.println("login successfully in facebook");	}

}
