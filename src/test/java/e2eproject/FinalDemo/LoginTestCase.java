package e2eproject.FinalDemo;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.HomePageObjects;
import PageObjectModel.LoginPageObject;
import Resourses.BaseClass;

public class LoginTestCase extends BaseClass {
	
	@Test(dataProvider="getData")
	
	public void BasePageNavigation(String username,String password) throws IOException {
		driver=initializeddriver();
		driver.get("http://www.qaclickacademy.com/");
		
		HomePageObjects HPO=new HomePageObjects(driver);
		HPO.clicksignin().click();
		
		LoginPageObject LPO=new LoginPageObject(driver);
			LPO.enterusername().sendKeys(username);
			LPO.enterpassword().sendKeys(password);
			LPO.clickLogIn().click();
		}
			
			@DataProvider
			public Object[][] getData() {
				Object[][] data=new Object[2][2];  
				data[0][0]="Test@1";               
				data[0][1]="Test@2";
				data[1][0]="abcd123";
				data[1][1]="acvf234";
				return data;	
		}
		
	}

		
		
			
		
		
		
		
	
