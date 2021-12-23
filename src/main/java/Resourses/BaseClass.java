package Resourses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver  driver;
	public WebDriver initializeddriver() throws IOException {
	Properties prop=new Properties();
	FileInputStream fis = new FileInputStream(
			"C:\\Users\\Sagar\\eclipse-workspace\\Pallu Training\\FinalDemo\\src\\main\\java\\Resourses\\Data.properties");
	prop.load(fis);
	String Browsername = prop.getProperty("Browser");
	if (Browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sagar\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if (Browsername.equals("firefox")) {
		//firefox code
	}
	else {
		//IE (Internet Explorer) code
	
	}
	return driver;

}
}

