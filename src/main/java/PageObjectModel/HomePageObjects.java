package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	public WebDriver driver;
	By signin=By.cssSelector("a[href*='sign_in']");
	
	
	
	
	public HomePageObjects(WebDriver driver2) {
		this.driver=driver2;
	}




	public WebElement clicksignin() {
		return driver.findElement(signin);
	}

}
